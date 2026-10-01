package org.example.listaRevisao.Exercicio3;

import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Menu da loja: ");
            System.out.println("1. Ver camisas");
            System.out.println("2. Ver calças");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1: Ver camisas");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2: Ver calças");
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
