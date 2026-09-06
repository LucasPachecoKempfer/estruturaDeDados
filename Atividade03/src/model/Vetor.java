package model;

public class Vetor<T> {

    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public T get(int indice) {
        return elementos[indice];
    }

    public void inserir(int indice, T elemento) {

        if (indice < 0 || indice > tamanho) {
            System.out.println("Indice inválido");
            return;
        }

        if (tamanho == elementos.length) {
            expandir();
        }

        for (int i = tamanho; i > indice; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[indice] = elemento;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[]) new Object[elementos.length * 2];
        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        elementos = novo;
    }

    @SuppressWarnings("unchecked")
    private void reduzir() {
        if (tamanho <= elementos.length / 4) {
            T[] novo = (T[]) new Object[elementos.length / 2];
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
        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        reduzir();
    }


    public void imprimir() {
        System.out.print("[");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

