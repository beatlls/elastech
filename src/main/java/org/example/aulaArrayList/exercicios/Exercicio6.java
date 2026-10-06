package org.example.aulaArrayList.exercicios;

import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Beatriz", "Hyan", "José", "Mary", "Rosy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        int posicao = nomes.indexOf(nome);

        if(posicao != -1) {
            System.out.printf("O nome %s está na lista.\n", nome);
            System.out.println("Posição na lista: " + posicao);
        } else {
            System.out.printf("O nome %s não está na lista.", nome);
        }
        sc.close();

    }
}
