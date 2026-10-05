package org.example.listaRevisao2.metodos;

public class Exercicio5 {

    static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
            return true;
        } else {
            System.out.println("O número " + numero + " é ímpar.");
            return false;
        }
    }

    public static void main(String[] args) {
        ehPar(4);
    }
}
