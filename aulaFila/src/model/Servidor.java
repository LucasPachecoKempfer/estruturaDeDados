package model;

import java.util.Random;

public class Servidor {
    private int totalReqGeradas;
    private int totalReqAtendidas;
    private int totalReqPerdidas;
    private Random aleatorio;
    private Fila<String> fila;
    private int numProcessadores;
    private int N;

    public Servidor(int capacidade, int numProcessadores, int N) {
        this.fila = new Fila<>(capacidade);
        this.numProcessadores = numProcessadores;
        this.N = N;
        this.aleatorio = new Random();
        this.totalReqAtendidas = 0;
        this.totalReqPerdidas = 0;
        this.totalReqGeradas = 0;
    }

    public void executar(int ciclos) {
        for (int i = 0; i < ciclos; i++) {

            // cada processador atende 1 requisição (se houver)
            for (int j = 0; j < numProcessadores; j++) {
                if (!fila.isEmpty()) {
                    fila.desenfileirar();
                    totalReqAtendidas++;
                }
            }

            // de 0 a N novas requisições
            int novasReq = aleatorio.nextInt(N + 1);
            adicionar(novasReq);
        }
    }

    public void adicionar(int qtd) {
        for (int i = 0; i < qtd; i++) {
            totalReqGeradas++;
            if (fila.isEmpty()) {
                totalReqPerdidas++;
            } else {
                fila.enfileirar("Req #" + totalReqGeradas);
            }
        }
    }

    public double getProbabilidadePerda() {
        if (totalReqGeradas == 0) return 0;
        return (double) totalReqPerdidas / totalReqGeradas;
    }
    
}