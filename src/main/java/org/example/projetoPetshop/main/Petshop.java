package org.example.projetoPetshop.main;

import org.example.projetoPetshop.menu.*;
import org.example.projetoPetshop.model.Pet;
import org.example.projetoPetshop.repository.BancoDePets;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BancoDePets banco = new BancoDePets();

        HashMap<Integer, Menu> menu = new HashMap<>();
        menu.put(1, new CadastroPet());
        menu.put(2, new ProcurarPet());
        menu.put(3, new ProcurarEspecies());
        menu.put(4, new EntrarFilaBanho());
        menu.put(5, new AtendendoFilaBanho());
        menu.put(6, new RealizarServicos());
        menu.put(0, new Sair());
        int opcao = -1;


        while (opcao != 0) {
            System.out.println("=== PETSHOP ===");
            System.out.println("1. Cadastrar pet");
            System.out.println("2. Buscar pet");
            System.out.println("3. Espécies cadastrados.");
            System.out.println("4. Entrar na fila de banho.");
            System.out.println("5. Visualizar a fila do banho.");
            System.out.println("6. Fechar pacote de serviços");
            System.out.println("0. Sair");
            System.out.println("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();
                Menu acao = menu.get(opcao);

                if (acao != null) {
                    acao.executar(sc, banco);
                } else {
                    System.out.println("Opção inválida, tente novamente.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Mensagem de aviso: Digite apenas números!");
                sc.nextLine();
            }
        }

        System.out.println("=== PETS CADASTRADOS ===");
        for (int i = 0; i < banco.total; i++) {
            System.out.println(banco.listaDePets[i].nome + "(" + banco.listaDePets[i].especie + ")" + " - " + banco.listaDePets[i].peso + " kg - " + banco.listaDePets[i].porte);
            banco.listaDePets[i].emitirSom();

        }


        if (banco.total > 0) {
            System.out.println("\n--- TESTANDO A SOBRECARGA ---");

            imprimirFicha(banco.listaDePets[0]);

            System.out.println("---");

            imprimirFicha(banco.listaDePets[0], "=== FICHA DO PET ===");
        }
        sc.close();
    }

    public static void imprimirFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    public static void imprimirFicha(Pet pet, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Peso: " + pet.peso + " kg");
        System.out.println("Porte: " + pet.porte);
    }
}
