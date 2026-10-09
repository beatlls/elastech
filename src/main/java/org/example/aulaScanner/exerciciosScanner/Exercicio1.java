package org.example.aulaScanner.exerciciosScanner;

import java.util.Scanner;

public class Exercicio1 {
    //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Oi " + nome + ", você tem " + idade + " anos e vai fazer " + (idade + 1) + " no próximo aniversário.");

        sc.close();
    }
}
