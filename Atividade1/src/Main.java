import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Antonio", 1000.00));
        funcionarios.add(new Funcionario("Carlos", 1000.00));

        Gerente gerente = new Gerente("Renato", 5000.00);

        Projeto projeto = new Projeto("Roblox", gerente, funcionarios);






    }
}
