package org.example.aula7.atividadesStrings;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDigitado = sc.nextLine();
        System.out.println("O seu nome em maíusculas fica: " + nomeDigitado.toUpperCase());
        System.out.println("O seu nome em minúsculas fica: " + nomeDigitado.toLowerCase());
    }
}
