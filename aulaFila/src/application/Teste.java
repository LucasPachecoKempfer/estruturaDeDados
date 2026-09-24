package application;

import model.Fila;

public class Teste {

    static void main() {

        Fila<String> fila = new Fila<>(10);


        fila.enfileirar("Hello World!");
        fila.enfileirar("Opa");
        fila.desenfileirar();

        fila.imprimir();




    }
}
