package org.example.aula14.projetoPetshop;

import java.util.ArrayDeque;
import java.util.Scanner;

public class EntrarFilaBanho implements Menu{

    @Override
    public void executar(Scanner sc, BancoDePets banco) {
        System.out.println("=== FILA DO BANHO ===");
        System.out.println("Digite o nome do pet: ");
        String petNaFila = sc.nextLine();

        banco.filaBanho.add(petNaFila);
        System.out.println(petNaFila + " entrou na fila.");
        System.out.println("Fila agora: " + banco.filaBanho);
    }
}
