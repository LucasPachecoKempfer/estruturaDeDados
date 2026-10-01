package model;

public class FilaCircular <T extends Comparable<T>> {

    private int inicio;
    private int fim;
    private int tamanho;
    private T[] elementos;

    public FilaCircular(int capacidade) {
        elementos = (T[]) new Comparable[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public void enfileirar(T elemento){
        if (elementos.length == tamanho){
            throw new RuntimeException("Ta cheio paizao");
        }

        fim = (fim + 1) % elementos.length;
        elementos[fim] = elemento;
        tamanho++;
    }

    public T desenfileirar(){

        if (isEmpty()){
            throw new RuntimeException("Ta vazio paizao");
        }


        T valor = elementos[inicio];
        elementos[inicio] = null;

        // nn precisa deslocar

        inicio = (inicio + 1) % elementos.length;
        tamanho--;

        return valor;
    }

    public void imprimir(){
        System.out.println("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % elementos.length;
            System.out.println(elementos[indice] + " ");
        }
        System.out.println();
    }
}
