package application;

import model.Pilha;

public class Teste {
    static void main() {

        Pilha<Integer> pilha = new Pilha<>(10);

        System.out.println("A pilha esta vazia " + pilha.isEmpty());


        pilha.push(10);
        pilha.push(20);
        pilha.push(15);
        pilha.push(50);
        pilha.push(61);

        System.out.println("A pilha esta vazia " + pilha.isEmpty());

        pilha.pop();
        int valor = pilha.pop();
        System.out.println("Segundo valor desempilhado " + valor);
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();


    }
}
