package org.example.aula7.atividadesStrings;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDigitado = sc.nextLine();
        System.out.println("Digite seu nome de novo: ");
        String novoNome = sc.nextLine();

        System.out.println("Os nomes são iguais? " + nomeDigitado.equals(novoNome));
    }
}
