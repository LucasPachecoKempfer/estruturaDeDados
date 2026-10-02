package model;

public class Escalonador {

    private FilaCircular<Processo> fila;
    private Processo[] processos;

    public Escalonador(Processo[] processos) {
        this.processos = processos;
        this.fila = new FilaCircular<>(10);
    }

    public void executar() {

        int tempo = 0;
        int processosTerminados = 0;

        while (processosTerminados < processos.length) {

            // verifica se algum processo chegou no tempo
            for (Processo p : processos) {

                if (p.getTempoChegada() == tempo) {

                    p.setStatus(Status.PRONTO);
                    fila.enfileirar(p);

                    System.out.println("Tempo " + tempo + ": " + p.getNome() + " chegou e entrou na fila.");
                }
            }

            // se a fila tiver processos, executa o primeiro
            if (!fila.isEmpty()) {

                Processo processo = fila.desenfileirar();

                processo.setStatus(Status.EXECUTANDO);

                System.out.println("Tempo " + tempo + ": " + processo.getNome() + " executando...");

                // simula o quantum de 2 segundos
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                // quantum = 2 instruções
                int instrucoesExecutadas = 0;

                for (int i = 0; i < 2; i++) {

                    if (processo.getInstrucoesRestantes() == 0) {
                        break;
                    }

                    processo.setInstrucoesRestantes(processo.getInstrucoesRestantes() - 1);

                    instrucoesExecutadas++;
                }

                System.out.println(
                        processo.getNome() + " executou " + instrucoesExecutadas + " instruções. Restam: " + processo.getInstrucoesRestantes()
                );

                // Verifica se terminou
                if (processo.getInstrucoesRestantes() == 0) {

                    processo.setStatus(Status.TERMINADO);
                    processosTerminados++;

                    System.out.println(processo.getNome() + " terminou!");

                } else {
                    // se ele ainda tem instruções ele vai voltar pro final da fila
                    processo.setStatus(Status.PRONTO);
                    fila.enfileirar(processo);
                }

            } else {
                System.out.println("Tempo " + tempo + ": fila vazia.");
            }

            tempo++;
        }
    }


}
