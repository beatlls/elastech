package org.example.aulaTryCatch.atividadesExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número inteiro: ");
            int numeroUm = sc.nextInt();
            System.out.println("Digite o segundo número inteiro: ");
            int numeroDois = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Você não digitou um número inteiro. ");
        }
    }
}
