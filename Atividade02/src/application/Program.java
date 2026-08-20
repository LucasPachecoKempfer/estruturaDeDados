package application;

import model.Vetor;

public class Program {

    static void main() {

        Vetor<Integer> vetor1 = new Vetor<>(1000);
        Vetor<Integer> vetor2 = new Vetor<>(10000);
        Vetor<Integer> vetor3 = new Vetor<>(100000);

        vetor1.preencherOrdenado(1000, 5000);

        vetor1.imprimir();

        System.out.println(buscarLinear(vetor1, 5));







    }

    public static int buscarLinear(Vetor<Integer> vetor, int alvo){

        for (int i = 0; i < vetor.obterTamanho(); i++) {
            if (vetor.ler(i) == alvo){
                return i;
            }
        }

        return -1;
    }
}
