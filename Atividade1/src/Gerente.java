public class Gerente extends Funcionario {

    private Projeto projeto;

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    public void calcularSalario(boolean finalizado, int numFuncionarios) {
        super.calcularSalario(finalizado);

        super.setSalarioFinal(getSalarioBase() * 1 + (projeto.getFuncionarios().size() * 0.01));
    }


}
