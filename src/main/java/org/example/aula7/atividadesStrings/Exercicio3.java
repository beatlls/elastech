package org.example.aula7.atividadesStrings;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDigitado = sc.nextLine();
        System.out.println("A primeira letra do seu nome é: " + nomeDigitado.charAt(0));
    }
}
