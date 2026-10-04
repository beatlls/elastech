package org.example.aulaTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Escreva seu número: ");
            int numero = sc.nextInt();
            System.out.println("O número é: " + numero);
        } catch (InputMismatchException ime) {
            System.out.println("O valor que você passou não foi um número. Por favor, digite um número");
        }
    }

    static void Excecoes(String tryCatch){
        try {
            int resultado = 10/0;
            System.out.println(resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Não se divide por 0!");
        }
    }
}
