package model;

public class Agenda {

    private Vetor<Contato>[] contatos;
    private int quantidade;

    @SuppressWarnings("unchecked")
    public Agenda() {

        contatos = (Vetor<Contato>[]) new Vetor[26];

        for (int i = 0; i < 26; i++) {
            contatos[i] = new Vetor<>(10);
        }

        quantidade = 0;

    }

    public int obterIndice(String nome) {

        char alfabeto[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String conversao = nome.toLowerCase();
        char primeiraLetra = conversao.charAt(0);

        for (int i = 0; i < alfabeto.length; i++) {
            if (primeiraLetra == alfabeto[i]) {
                return i;
            }
        }

        return -1;
    }

    public boolean adicionarContato(Contato contato) {

        int indice = obterIndice(contato.getNome());

        Vetor<Contato> vetor = contatos[indice];

        int posicao = vetor.getTamanho();

        for (int i = 0; i < vetor.getTamanho(); i++) {

            if (contato.getNome().compareToIgnoreCase(vetor.get(i).getNome()) < 0) {
                posicao = i;
                break;
            }
        }

        vetor.inserir(posicao, contato);

        quantidade++;

        return true;
    }

    public boolean removerContato(String nome) {

        int indice = obterIndice(nome);

        Vetor<Contato> vetor = contatos[indice];

        for (int i = 0; i < vetor.getTamanho(); i++) {

            if (vetor.get(i).getNome().equalsIgnoreCase(nome)) {

                vetor.remover(i);
                quantidade--;

                return true;
            }
        }

        return false;
    }

    public boolean atualizarContato(String nome, String novoTelefone) {

        Contato contato = buscarContato(nome);

        if (contato == null) {
            return false;
        }

        contato.setTelefone(novoTelefone);

        return true;
    }

    public Contato buscarContato(String nome) {

        int indice = obterIndice(nome);

        Vetor<Contato> vetor = contatos[indice];

        for (int i = 0; i < vetor.getTamanho(); i++) {

            if (vetor.get(i).getNome().equalsIgnoreCase(nome)) {
                return vetor.get(i);
            }
        }

        return null;
    }


}