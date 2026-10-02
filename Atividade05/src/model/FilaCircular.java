package model;

import model.Vetor;

public class FilaCircular<T extends Comparable<T>> {

    private int inicio;
    private int fim;
    private int tamanho;
    private Vetor<T> vetor;

    public FilaCircular(int capacidade) {
        vetor = new Vetor<>(capacidade);
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int obterTamanho() {
        return tamanho;
    }

    public void enfileirar(T elemento) {

        if (tamanho == vetor.obterCapacidade()) {
            throw new RuntimeException("Fila está cheia");
        }

        vetor.alterar(fim, elemento);

        fim = (fim + 1) % vetor.obterCapacidade();

        tamanho++;
    }

    public T desenfileirar() {

        if (tamanho == 0) {
            throw new RuntimeException("Fila está vazia");
        }

        T valor = vetor.acessar(inicio);

        vetor.alterar(inicio, null);

        inicio = (inicio + 1) % vetor.obterCapacidade();

        tamanho--;

        return valor;
    }
}