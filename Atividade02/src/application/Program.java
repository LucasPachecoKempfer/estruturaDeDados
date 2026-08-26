package application;

import model.Vetor;

import java.util.Arrays;

public class Program {

    static void main() {

        // vetor 1k de elementos
        Vetor<Integer> vetor1 = new Vetor<>(1000);
        vetor1.preencherOrdenado(1000, 1000);

        int primeiro1 = 0;
        int meio1 = vetor1.obterTamanho() / 2;
        int ultimo1 = vetor1.obterTamanho() - 1;

        System.out.println("\n-------------------------------------");
        System.out.println("vetor com 1k de elementos");
        System.out.println("---------------------------------------");

        System.out.println("\n-- Busca Linear --");

        System.out.println("Início:");
        long inicio = System.nanoTime();
        int resultado = buscarLinear(vetor1, vetor1.ler(primeiro1));
        long fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = buscarLinear(vetor1, vetor1.ler(meio1));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = buscarLinear(vetor1, vetor1.ler(ultimo1));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");


        System.out.println("\n-- Busca Binária --");

        System.out.println("Início:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor1, vetor1.ler(primeiro1));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor1, vetor1.ler(meio1));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor1, vetor1.ler(ultimo1));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");


        System.out.println("\n-- Arrays.binarySearch --");

        System.out.println("Início:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(vetor1.obterElementos(),
                0,
                vetor1.obterTamanho(),
                vetor1.ler(primeiro1)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(
                vetor1.obterElementos(),
                0,
                vetor1.obterTamanho(),
                vetor1.ler(meio1)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(
                vetor1.obterElementos(),
                0,
                vetor1.obterTamanho(),
                vetor1.ler(ultimo1)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");


        // vetor 10k de elementos
        Vetor<Integer> vetor2 = new Vetor<>(10000);
        vetor2.preencherOrdenado(10000, 10000);

        int primeiro2 = 0;
        int meio2 = vetor2.obterTamanho() / 2;
        int ultimo2 = vetor2.obterTamanho() - 1;

        System.out.println("\n-------------------------------------");
        System.out.println("vetor com 10k de elementos");
        System.out.println("---------------------------------------");

        System.out.println("\n-- Busca Linear --");

        System.out.println("Início:");
        inicio = System.nanoTime();
        resultado = buscarLinear(vetor2, vetor2.ler(primeiro2));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = buscarLinear(vetor2, vetor2.ler(meio2));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = buscarLinear(vetor2, vetor2.ler(ultimo2));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");


        System.out.println("\n-- Busca Binária --");

        System.out.println("Início:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor2, vetor2.ler(primeiro2));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor2, vetor2.ler(meio2));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor2, vetor2.ler(ultimo2));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");


        System.out.println("\n-- Arrays.binarySearch --");

        System.out.println("Início:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(
                vetor2.obterElementos(),
                0,
                vetor2.obterTamanho(),
                vetor2.ler(primeiro2)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(
                vetor2.obterElementos(),
                0,
                vetor2.obterTamanho(),
                vetor2.ler(meio2)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(
                vetor2.obterElementos(),
                0,
                vetor2.obterTamanho(),
                vetor2.ler(ultimo2)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");


        // vetor 100k de elementos
        Vetor<Integer> vetor3 = new Vetor<>(100000);
        vetor3.preencherOrdenado(100000, 100000);

        int primeiro3 = 0;
        int meio3 = vetor3.obterTamanho() / 2;
        int ultimo3 = vetor3.obterTamanho() - 1;

        System.out.println("\n---------------------------------");
        System.out.println("vetor com 100k de elementos");
        System.out.println("-----------------------------------");

        System.out.println("\n-- Busca Linear --");

        System.out.println("Início:");
        inicio = System.nanoTime();
        resultado = buscarLinear(vetor3, vetor3.ler(primeiro3));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = buscarLinear(vetor3, vetor3.ler(meio3));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = buscarLinear(vetor3, vetor3.ler(ultimo3));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");


        System.out.println("\n-- Busca Binária --");

        System.out.println("Início:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor3, vetor3.ler(primeiro3));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor3, vetor3.ler(meio3));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = buscaBinaria(vetor3, vetor3.ler(ultimo3));
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");


        System.out.println("\n-- Arrays.binarySearch --");

        System.out.println("Início:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(
                vetor3.obterElementos(),
                0,
                vetor3.obterTamanho(),
                vetor3.ler(primeiro3)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nMeio:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(
                vetor3.obterElementos(),
                0,
                vetor3.obterTamanho(),
                vetor3.ler(meio3)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");

        System.out.println("\nFim:");
        inicio = System.nanoTime();
        resultado = Arrays.binarySearch(
                vetor3.obterElementos(),
                0,
                vetor3.obterTamanho(),
                vetor3.ler(ultimo3)
        );
        fim = System.nanoTime();
        System.out.println("Posição encontrada: " + resultado);
        System.out.println("Tempo: " + (fim - inicio) + " ns");
    }


    public static int buscarLinear(Vetor<Integer> vetor, int alvo) {

        int comparacoes = 0;

        for (int i = 0; i < vetor.obterTamanho(); i++) {
            comparacoes++;

            if (vetor.ler(i) == alvo) {
                System.out.println("Comparações: " + comparacoes);
                return i;
            }
        }

        System.out.println("Comparações: " + comparacoes);
        return -1;
    }


    public static int buscaBinaria(Vetor<Integer> vetor, int alvo) {

        int inicio = 0;
        int fim = vetor.obterTamanho() - 1;
        int comparacoes = 0;

        while (inicio <= fim) {

            int meio = (inicio + fim) / 2;

            comparacoes++;

            if (vetor.ler(meio) > alvo) {
                fim = meio - 1;

            } else if (vetor.ler(meio) < alvo) {
                inicio = meio + 1;

            } else {
                System.out.println("Comparações: " + comparacoes);
                return meio;
            }
        }

        System.out.println("Comparações: " + comparacoes);
        return -1;
    }
}