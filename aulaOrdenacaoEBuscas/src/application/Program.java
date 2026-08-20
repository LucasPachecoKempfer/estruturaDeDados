package application;

import model.Vetor;

public class Program {
    static void main() {

        Vetor<Integer> vetor = new Vetor<>(10);

        vetor.imprimir();

        System.out.println(buscarBinaria(vetor, 49));
    }

    public static int buscarLinearOrdenada(Vetor<Integer> vetor, int alvo){
        for (int i = 0; i < vetor.obterTamanho(); i++) {
            if (vetor.ler(i) == alvo){
                return i;
            } else if (vetor.ler(i) > alvo){
                return -1;
            }
        }
        return -1;
    }

    public static int buscarBinaria(Vetor<Integer> vetor, int alvo){

        int inicio = 0;
        int fim = vetor.obterTamanho();

        while (inicio <= fim) {
            int meio = (inicio + fim)/2;

            if (vetor.ler(meio) == alvo){
                return meio;
            } else if (vetor.ler(meio) > alvo){
                fim = meio -1;
            } else {
                inicio = meio + 1;
            }
        }

        return -1;
    }

}
