package org.example.aula7.atividadesStrings;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String fraseDigitada = sc.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavraDigitada = sc.nextLine();

        System.out.println("A palavra aparece na frase? " + fraseDigitada.contains(palavraDigitada));
    }
}
