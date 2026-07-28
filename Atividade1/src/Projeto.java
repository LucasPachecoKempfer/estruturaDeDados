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

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void custoTotal(Double salarioGerente, ArrayList<Funcionario> SalarioFuncionarios){
        double salarios = 0;

    }

}
