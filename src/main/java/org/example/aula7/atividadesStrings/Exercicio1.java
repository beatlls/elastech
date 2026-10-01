package org.example.aula7.atividadesStrings;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeDigitado = sc.nextLine();
        System.out.println("O seu nome tem: " + nomeDigitado.length() + " letras.");
    }
}
