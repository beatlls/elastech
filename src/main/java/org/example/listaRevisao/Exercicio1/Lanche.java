package org.example.listaRevisao.Exercicio1;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do lanche que deseja comprar: ");
        String lanche = scanner.nextLine();

        System.out.println("Digite o valor do lanche: ");
        double valor = scanner.nextDouble();

        if (valor >= 30) {
            valor -= 5.00;
        }

        System.out.printf("O lanche " + lanche + " custa R$ %.2f \n", valor);

        scanner.close();
    }
}
