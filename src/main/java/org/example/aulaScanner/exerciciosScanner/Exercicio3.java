package org.example.aulaScanner.exerciciosScanner;

import java.util.Scanner;

public class Exercicio3 {
    // 3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Parabéns! Você foi aprovada.");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Reprovada.");
        }

        sc.close();
    }
}
