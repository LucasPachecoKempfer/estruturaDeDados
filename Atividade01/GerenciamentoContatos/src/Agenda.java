public class Agenda {

    private Contato[] contatos;
    private int quantidade;

    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];
        quantidade = 0;
    }

    public boolean adicionarContato(Contato contato) {

        if (quantidade == contatos.length) {
            System.out.println("Agenda cheia!");
            return false;
        }

        for (int i = 0; i < quantidade; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(contato.getNome())) {
                System.out.println("Nome já cadastrado.");
                return false;
            }

            if (contatos[i].getTelefone().equals(contato.getTelefone())) {
                System.out.println("Telefone já cadastrado.");
                return false;
            }
        }

        contatos[quantidade] = contato;
        quantidade++;

        System.out.println("Contato adicionado!");
        return true;
    }

    public boolean removerContato(String nome) {

        for (int i = 0; i < quantidade; i++) {

            if (contatos[i].getNome().equalsIgnoreCase(nome)) {

                for (int j = i; j < quantidade - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }

                contatos[quantidade - 1] = null;
                quantidade--;

                System.out.println("Contato removido");
                return true;
            }
        }

        System.out.println("Contato nao encontrado.");
        return false;
    }

    public Contato buscarPorNome(String nome) {

        for (int i = 0; i < quantidade; i++) {

            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                return contatos[i];
            }

        }

        return null;
    }

    public Contato buscarPorTelefone(String telefone) {

        for (int i = 0; i < quantidade; i++) {

            if (contatos[i].getTelefone().equals(telefone)) {
                return contatos[i];
            }

        }

        return null;
    }

    public boolean atualizarContato(String nome, String novoTelefone, String novoEmail) {

        Contato contato = buscarPorNome(nome);

        if (contato == null) {
            return false;
        }

        for (int i = 0; i < quantidade; i++) {

            if (!contatos[i].getNome().equalsIgnoreCase(nome)
                    && contatos[i].getTelefone().equals(novoTelefone)) {

                System.out.println("Telefone já existe.");
                return false;
            }

        }

        contato.setTelefone(novoTelefone);
        contato.setEmail(novoEmail);

        return true;
    }

    public void listarContatos() {

        if (quantidade == 0) {
            System.out.println("Agenda vazia.");
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            System.out.println("----------------");
            System.out.println(contatos[i]);
        }
    }

    public void inserirEmLote(Contato[] novos) {

        for (Contato contato : novos) {

            if (contato != null) {
                adicionarContato(contato);
            }

        }

    }

    public void buscarPorPrefixo(String prefixo) {

        boolean encontrou = false;

        for (int i = 0; i < quantidade; i++) {

            if (contatos[i].getNome().startsWith(prefixo)) {
                System.out.println(contatos[i]);
                System.out.println("-------");
                encontrou = true;
            }

        }

        if (!encontrou) {
            System.out.println("Nenhum contato encontrado.");
        }
    }

}