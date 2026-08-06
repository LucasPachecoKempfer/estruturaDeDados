public class Principal {
      static void main() {

      Agenda agenda = new Agenda(5);

      agenda.adicionarContato(new Contato("Lucas", "4898889-9330", "lpachecokempfer@gmail.com"));
      agenda.adicionarContato(new Contato("Rogério", "4899999-9999", "rogerio@gmail.com"));

      System.out.println("\nbuscar por nome: ");
      System.out.println(agenda.buscarPorNome("Lucas"));

      System.out.println("\natualizando: ");
      agenda.atualizarContato("Lucas", "4891111-1111", "novoemailpratestar@gmail.com");
      System.out.println(agenda.buscarPorNome("Lucas"));

      System.out.println("\nbuscar por telefone: ");
      System.out.println(agenda.buscarPorTelefone("4891111-1111"));

      System.out.println("\nbuscar por prefixo: ");
      agenda.buscarPorPrefixo("Ro");

      System.out.println("\nlista de contatos: ");
      agenda.listarContatos();

      System.out.println("\nremovendo o Lucas: ");
      agenda.removerContato("Lucas");

      System.out.println("\nlista após remoção: ");
      agenda.listarContatos();


      Contato[] lote = {
              new Contato("Ana", "4893333-3333"),
              new Contato("Bruno", "4892222-2222", "bruno@gmail.com")
      };

      agenda.inserirEmLote(lote);

      System.out.println("\ndps da inserção em lote");
      agenda.listarContatos();
   }
}