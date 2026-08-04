import java.util.ArrayList;

public class Projeto {

    private String nomeDoProjeto;
    private Gerente gerente;
    private ArrayList<Funcionario> funcionarios;

    public Projeto() {
    }

    public Projeto(String nomeDoProjeto, Gerente gerente, ArrayList<Funcionario> funcionarios) {
        this.nomeDoProjeto = nomeDoProjeto;
        this.gerente = gerente;
        this.funcionarios = funcionarios;

        gerente.setProjeto(this);
    }

    public String getNomeDoProjeto() {
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto) {
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public double custoTotal() {
        double total = gerente.getSalarioFinal();

        for (Funcionario f : funcionarios) {
            total += f.getSalarioFinal();
        }

        return total;
    }

    public String listarFuncionarios() {
        StringBuilder sb = new StringBuilder();

        for (Funcionario f : funcionarios) {
            sb.append(f.getNome())
                    .append(" - R$ ")
                    .append(f.getSalarioFinal())
                    .append("\n");
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return
                "Nome do projeto: " + nomeDoProjeto + "\n" +
                "Nome do gerente: " + gerente.getNome() + "\n" +
                "Salário Final do gerente: " + gerente.getSalarioFinal() + "\n" +
                "Funcionários: \n" + listarFuncionarios() + "\n" +
                "Custo total do projeto: R$ " + custoTotal();

    }
}
