public class Gerente extends Funcionario {

    private Projeto projeto;

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    public void calcularSalario() {
        super.setSalarioFinal(getSalarioBase() * (1 + projeto.getFuncionarios().size() * 0.01));
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
