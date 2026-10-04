package org.example.aulaTryCatch.atividadesExcecoes;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double[] notas = {3.5, 7.4, 6.2, 8.2, 9.0};
            System.out.println("Uma posição, uma nota: ");
            int posicao = sc.nextInt();
            System.out.println("A nota da posição " + posicao + " é: " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Posição inválida, ela só vai de 0 a 4.");
        } finally {
            sc.close();
        }
    }
}
