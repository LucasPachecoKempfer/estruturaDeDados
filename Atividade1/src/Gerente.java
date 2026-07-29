public class Gerente extends Funcionario {

    private Projeto projeto;

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    public void calcularSalario(boolean finalizado) {

        super.calcularSalario(finalizado);

        setSalarioFinal(getSalarioFinal() * (1 + projeto.getFuncionarios().size() * 0.01));
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
