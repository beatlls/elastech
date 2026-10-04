package org.example.aulaTryCatch.atividadesExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("A sua idade é: " + idade + " anos.");
        } catch (InputMismatchException ime) {
            System.out.println("Isso não é um número, por favor, tente novamente.");
        }
    }
}
