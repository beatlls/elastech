package org.example.listaRevisao.Exercicio6;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("O usuário " + nomeCompleto + " nasceu em " + anoNascimento);

        scanner.close();
    }
}
