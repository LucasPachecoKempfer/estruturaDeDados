package application;

import model.Escalonador;
import model.Processo;

public class Teste1 {
    static void main() {

        Processo p1 = new Processo("P1", 7, 0);
        Processo p2 = new Processo("P2", 4, 0);
        Processo p3 = new Processo("P3", 5, 1);
        Processo p4 = new Processo("P4", 6, 2);
        Processo p5 = new Processo("P5", 3, 4);

        Processo[] processos = {p1, p2, p3, p4, p5};

        Escalonador escalonador = new Escalonador(processos);


        escalonador.executar();



    }
}
