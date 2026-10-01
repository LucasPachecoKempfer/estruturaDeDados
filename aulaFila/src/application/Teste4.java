package application;


import model.Servidor;

public class Teste4 {

    public static void main(String[] args) {
        int capacidade = 50;
        int ciclos = 100000;

        System.out.printf("%-6s %-14s %-10s%n", "N", "Processadores", "P(perda)");

        for (int N = 2; N <= 10; N += 2) {
            for (int proc = 1; proc <= 6; proc++) {
                Servidor s = new Servidor(capacidade, proc, N);
                s.executar(ciclos);
                System.out.printf("%-6d %-14d %.4f%n", N, proc, s.getProbabilidadePerda());
            }
        }
    }
}