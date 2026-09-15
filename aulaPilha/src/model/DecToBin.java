package model;

public class DecToBin {

    static void main() {

        Stack<Integer> pilha = new Stack<>(50);

        int numero = 22;

        while (numero > 0) {
            int resto = numero % 2;
            pilha.push(resto);
            numero = numero/2;
        }

        StringBuilder binario = new StringBuilder();
        while (!pilha.isEmpty()){
            binario.append(pilha.pop());
        }

        System.out.println(binario.toString());
    }
}
