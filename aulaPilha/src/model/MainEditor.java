package model;

public class MainEditor {

    static void main() {

        EditorTexto editor = new EditorTexto();

        editor.escrever("Olá ");
        editor.escrever("Mundo!");

        System.out.println("Conteudo atual: " + editor.getConteudo());

        editor.desfazer();
        System.out.println("Conteudo após desfazer " + editor.getConteudo());

        editor.refazer();
        System.out.println("Conteudo após refazer " + editor.getConteudo());

        editor.escrever("\n --VÃO ESTUDAR!-- ");


    }
}
