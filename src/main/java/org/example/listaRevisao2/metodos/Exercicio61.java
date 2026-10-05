package org.example.listaRevisao2.metodos;

import java.util.Scanner;

public class Exercicio61 {
    static void somar(int n1, int n2, int n3) {
        System.out.printf("A soma de %d, %d e %d é igual a %d", n1, n2, n3, (n1 + n2 + n3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro inteiro: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int n2 = sc.nextInt();
        System.out.println("Digite o terceiro número inteiro: ");
        int n3 = sc.nextInt();
        somar(n1, n2, n3);

        sc.close();
    }
}
