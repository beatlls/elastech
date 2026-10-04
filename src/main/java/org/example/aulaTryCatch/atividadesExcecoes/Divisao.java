package org.example.aulaTryCatch.atividadesExcecoes;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número para ser dividido por 100: ");
            int numero = sc.nextInt();
            int resultado = 100 % numero;
            System.out.println("O resultado é " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Não é possível dividir 100 por 0. Tente novamente.");
        } finally {
            sc.close();
        }
    }
}
