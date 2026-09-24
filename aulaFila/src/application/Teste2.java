package application;

import model.Fila;
import model.Pacote;
import model.Produtor;

public class Teste2 {

    static void main() {

        Fila<Pacote> fila = new Fila<>(10);

        Produtor produtor1 = new Produtor("Lucas", "PC-A");
        Produtor produtor2 = new Produtor("Gabriel", "PC-B");

        produtor1.produzirPacote(fila, 1, "Login", "Servidor 1", "AAAA");
        produtor1.produzirPacote(fila, 2, "Imagem", "Servidor 2", "AAAA");

        produtor2.produzirPacote(fila, 3, "Imagem", "Servidor 3", "AAAA");

        System.out.println("FILA DE PACOTES");
        fila.imprimir();

        fila.desenfileirar();
        fila.imprimir();


    }
}
