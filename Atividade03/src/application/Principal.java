package application;

import model.Agenda;
import model.Contato;

import java.util.Scanner;

public class Principal {

    static void main() {

        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao;

        do {
            System.out.println("\n--- MENU DA AGENDA DE CONTATOS ---");
            System.out.println("1 - Adicionar Contato (Ordenado)");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Atualizar Contato");
            System.out.println("5 - Sair");

            System.out.print("\nEscolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();

                    Contato contato = new Contato(nome, telefone);

                    if (agenda.adicionarContato(contato)) {
                        int indice = agenda.obterIndice(nome);
                        char letra = Character.toUpperCase(nome.charAt(0));

                        System.out.println("Contato '" + nome
                                + "' adicionado com sucesso na letra '"
                                + letra + "' (Indice " + indice + ")!");
                    }

                    break;

                case 2:
                    System.out.print("Digite o nome do contato a remover: ");
                    nome = scanner.nextLine();

                    if (agenda.removerContato(nome)) {
                        int indice = agenda.obterIndice(nome);
                        char letra = Character.toUpperCase(nome.charAt(0));

                        System.out.println("Contato '" + nome
                                + "' removido com sucesso do Vetor '"
                                + letra + "'!");
                    } else {
                        System.out.println("Contato nao encontrado.");
                    }

                    break;

                case 3:
                    System.out.print("Digite o nome do contato a buscar: ");
                    nome = scanner.nextLine();

                    contato = agenda.buscarContato(nome);

                    if (contato != null) {
                        char letra = Character.toUpperCase(nome.charAt(0));

                        System.out.println("Contato encontrado no Vetor '"
                                + letra + "': "
                                + contato.getNome()
                                + ", Telefone: "
                                + contato.getTelefone());
                    } else {
                        System.out.println("Contato nao encontrado.");
                    }

                    break;

                case 4:
                    System.out.print("Digite o nome do contato a atualizar: ");
                    nome = scanner.nextLine();

                    System.out.print("Digite o novo telefone: ");
                    telefone = scanner.nextLine();

                    if (agenda.atualizarContato(nome, telefone)) {
                        System.out.println("Contato '" + nome
                                + "' atualizado com sucesso!");
                    } else {
                        System.out.println("Contato nao encontrado.");
                    }

                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
