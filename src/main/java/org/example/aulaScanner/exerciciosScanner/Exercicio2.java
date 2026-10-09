package org.example.aulaScanner.exerciciosScanner;

import java.util.Scanner;

public class Exercicio2 {
    // 2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;
        int resto = n1 % n2;

        System.out.println("A soma desses dois números é: " + soma + ". A subtração é: " + subtracao + ". A multiplicação é: "+ multiplicacao + ". A divisão é: " + divisao + ". E o resto é: " + resto);

        sc.close();
    }
}
