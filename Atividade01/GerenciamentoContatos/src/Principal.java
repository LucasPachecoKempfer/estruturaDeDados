import java.util.Scanner;

public class Principal {
      static void main() {

            Scanner scanner = new Scanner(System.in);

            Agenda agenda = new Agenda(5);

            int opcao;

            do {

                  System.out.println("\n--- Menu Agenda ---");
                  System.out.println("1 - Adicionar Contato");
                  System.out.println("2 - Remover Contato");
                  System.out.println("3 - Buscar Contato");
                  System.out.println("4 - Atualizar Contato");
                  System.out.println("5 - Sair");

                  System.out.print("\nEscolha uma opcao: ");
                  opcao = scanner.nextInt();
                  scanner.nextLine();

                  switch (opcao) {

                        case 1:
                              System.out.print("Nome: ");
                              String nome = scanner.nextLine();

                              System.out.print("Telefone: ");
                              String telefone = scanner.nextLine();

                              System.out.print("Email: ");
                              String email = scanner.nextLine();

                              agenda.adicionarContato(
                                      new Contato(nome, telefone, email)
                              );

                              break;

                        case 2:
                              System.out.print("Nome do contato que deseja remover: ");
                              nome = scanner.nextLine();

                              agenda.removerContato(nome);

                              break;

                        case 3:
                              System.out.println("\n1 - Buscar por nome");
                              System.out.println("2 - Buscar por telefone");
                              System.out.println("3 - Buscar por prefixo");

                              System.out.print("Escolha uma opcao: ");
                              int busca = scanner.nextInt();
                              scanner.nextLine();

                              switch (busca) {

                                    case 1:
                                          System.out.print("Nome: ");
                                          nome = scanner.nextLine();

                                          Contato contato = agenda.buscarPorNome(nome);

                                          if (contato != null) {
                                                System.out.println(contato);
                                          } else {
                                                System.out.println("Contato nao encontrado.");
                                          }

                                          break;

                                    case 2:
                                          System.out.print("Telefone: ");
                                          telefone = scanner.nextLine();

                                          contato = agenda.buscarPorTelefone(telefone);

                                          if (contato != null) {
                                                System.out.println(contato);
                                          } else {
                                                System.out.println("Contato nao encontrado.");
                                          }

                                          break;

                                    case 3:
                                          System.out.print("Prefixo: ");
                                          String prefixo = scanner.nextLine();

                                          agenda.buscarPorPrefixo(prefixo);

                                          break;

                                    default:
                                          System.out.println("Opcao invalida.");
                              }

                              break;

                        case 4:
                              System.out.print("Nome do contato: ");
                              nome = scanner.nextLine();

                              System.out.print("Novo telefone: ");
                              telefone = scanner.nextLine();

                              System.out.print("Novo email: ");
                              email = scanner.nextLine();

                              boolean atualizado = agenda.atualizarContato(
                                      nome,
                                      telefone,
                                      email
                              );

                              if (atualizado) {
                                    System.out.println("Contato atualizado!");
                              } else {
                                    System.out.println("Nao foi possivel atualizar.");
                              }

                              break;

                        case 5:
                              System.out.println("Saindo...");
                              break;

                        default:
                              System.out.println("Opcao invalida.");
                  }

            } while (opcao != 5);

            scanner.close();
      }
}