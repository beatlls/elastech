package org.example.aula14.projetoPetshop;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        int total = 0;
        Pet[] listaDePets = new Pet[100];

        while (opcao != 0) {
            System.out.println("=== PETSHOP ===");
            System.out.println("1. Cadastrar pet");
            System.out.println("2. Buscar pet");
            System.out.println("3. Espécies cadastrados.");
            System.out.println("0. Sair");
            System.out.println("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        Pet meuPet = new Pet();

                        System.out.println("Digite o nome do seu pet: ");
                        meuPet.nome = sc.nextLine();

                        System.out.println("Digite a espécie do seu pet: ");
                        meuPet.especie = sc.nextLine();

                        System.out.println("Digite o peso do seu pet: ");
                        meuPet.peso = sc.nextDouble();
                        sc.nextLine();

                        meuPet.porte = meuPet.definirPorte();

                        listaDePets[total] = meuPet;

                        total++;
                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                        break;
                    case 2:
                        System.out.println("Qual pet você procura?");
                        String nomeBuscado = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (listaDePets[i].nome.equalsIgnoreCase(nomeBuscado)) {
                                System.out.println("Encontrado: " + listaDePets[i].nome + " (" + listaDePets[i].especie + ") " + " - " + listaDePets[i].peso + " kg - " + listaDePets[i].porte);
                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;
                    case 3:
                        HashSet<String> especiesCadastradas = new HashSet<>();

                        for (int i = 0; i < total; i++) {
                            especiesCadastradas.add(listaDePets[i].especie);
                        }

                        System.out.println("=== ESPÉCIES CADASTRADAS");

                        for(String especie : especiesCadastradas) {
                            System.out.println(" - " + especie);
                        }

                        System.out.println("\n Total de espécies diferentes: " + especiesCadastradas.size());
                        break;
                    case 0:
                        System.out.println("Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        System.out.println("--- PETS CADASTRADOS ---");

                }
            } catch (InputMismatchException ime) {
                System.out.println("Mensagem de aviso: Digite apenas números!");
                sc.nextLine();
            }
        }
        for (int i = 0; i < total; i++) {
            System.out.println(listaDePets[i].nome + "(" + listaDePets[i].especie + ")" + " - " + listaDePets[i].peso + " kg - " + listaDePets[i].porte);
        }
        sc.close();
    }
}
