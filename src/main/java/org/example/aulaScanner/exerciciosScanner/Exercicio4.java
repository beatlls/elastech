package org.example.aulaScanner.exerciciosScanner;

import java.util.Scanner;

public class Exercicio4 {
    // 4 - Peça um número e mostre a tabuada dele de 1 a 10.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        System.out.println("=== Tabuada do " + num + " ===");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
