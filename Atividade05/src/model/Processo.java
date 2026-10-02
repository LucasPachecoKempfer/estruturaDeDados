package model;

public class Processo implements Comparable<Processo> {

    @Override
    public int compareTo(Processo outro) {
        return this.nome.compareTo(outro.nome);
    }

    private String nome;
    private int instrucoesRestantes;
    private int tempoChegada;
    private Status status;

    public Processo(String nome, int instrucoesRestantes, int tempoChegada) {
        this.nome = nome;
        this.instrucoesRestantes = instrucoesRestantes;
        this.tempoChegada = tempoChegada;
        this.status = Status.PRONTO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getInstrucoesRestantes() {
        return instrucoesRestantes;
    }

    public void setInstrucoesRestantes(int instrucoesRestantes) {
        this.instrucoesRestantes = instrucoesRestantes;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public void setTempoChegada(int tempoChegada) {
        this.tempoChegada = tempoChegada;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
