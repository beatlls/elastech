package org.example.listaRevisao2.metodos;

import java.util.Scanner;

public class Exercicio6 {
    static void somar(int n1, int n2) {
        System.out.printf("A soma de %d e %d é igual a %d", n1, n2, (n1 + n2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = sc.nextInt();
        somar(n1, n2);

        sc.close();
    }
}
