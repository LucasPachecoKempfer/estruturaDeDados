package vetor.Exemplos;

import vetor.Produto;
import vetor.Vetor;

public class exemplo1 {

    static void main() {

        Vetor<Produto> estoque = new Vetor<>(10);

        estoque.inserir(new Produto(1, "Monitor", 500));
        estoque.inserir(new Produto(2, "Teclado", 100));
        estoque.inserir(new Produto(3, "Mouse", 200));

        estoque.imprimir();


    }

}
