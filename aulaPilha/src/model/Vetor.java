package model;

import java.util.Random;

public class Vetor<T extends Comparable<T>>{

    private T[] elementos;
    private int tamanho;
    private final Random random = new Random();

    @SuppressWarnings("unchecked")
    public Vetor(int quantidade) {
        elementos = (T[]) new Comparable[quantidade];
        tamanho = 0;
    }

    public int obterTamanho() {
        return this.tamanho;
    }

    public T ler(int indice) {
        if (indice >= 0 && indice < tamanho) {
            return elementos[indice];
        } else {
            throw new IndexOutOfBoundsException("Indice inválido");
        }
    }

    public void inserir(T elemento) {
        if (tamanho == elementos.length) {
            expandir();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[]) new Comparable[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        elementos = novo;
    }

    @SuppressWarnings("unchecked")
    private void reduzir() {
        if (tamanho <= elementos.length / 4) {
            T[] novo = (T[]) new Comparable[elementos.length / 2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
            elementos = novo;
        }
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Indice Inválido");
            return;
        }
        for (int i = indice; i < tamanho; i++) {
            elementos[i] = elementos[i+1];
        }
        elementos[tamanho-1] = null;
        tamanho--;
        reduzir();
    }

    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < tamanho ; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho -1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    @SuppressWarnings("unchecked")
    public void preencherOrdenado(int quantidade, int range) {
        for (int i = 0; i < quantidade; i++) {
            // Gera o número randômico e faz o cast para T (funciona se T for Integer)
            T numero = (T) Integer.valueOf(random.nextInt(range));

            // Encontra a posição correta para manter o vetor ordenado
            int pos = 0;
            while (pos < obterTamanho() && ler(pos).compareTo(numero) < 0) {
                pos++;
            }

            // Insere na posição ordenada (abre espaço e desloca os elementos)
            inserirNaPosicao(pos, numero);
        }
    }

    public void inserirNaPosicao(int pos, T elemento) {
        if (tamanho == elementos.length) {
            expandir();
        }
        for (int i = tamanho; i > pos; i--) {
            elementos[i] = elementos[i - 1];
        }
        elementos[pos] = elemento;
        tamanho++;
    }

}
