package org.example.listaRevisao.Desafio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        
        while (opcao != 2) {

            System.out.println("Deseja iniciar? Pressione 1 continuar, 2 para sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    sc.nextLine();
                    Aluna aluna = new Aluna();
                    System.out.println("Digite o nome: ");
                    String nomeDigitado = sc.nextLine();
                    System.out.println("Digite a primeira nota: ");
                    double notaDigitada = sc.nextDouble();
                    System.out.println("Digite a segunda nota: ");
                    double notaDigitada2 = sc.nextDouble();
                    sc.nextLine();
                    aluna.media = (notaDigitada + notaDigitada2) / 2;
                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }
                    aluna.nome = nomeDigitado;
                    aluna.nota = notaDigitada;
                    aluna.nota2 = notaDigitada2;
                    System.out.printf("O nome da aluna é %s, sua primeira nota foi %s, sua segunda nota foi %s e sua média final foi %s. Aluna aprovada: %s\n", aluna.nome, aluna.nota, aluna.nota2, aluna.media, aluna.passou);
                    break;
                case 2:
                    System.out.println("Encerrando o sistema. Até logo!");
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }
    }
}
