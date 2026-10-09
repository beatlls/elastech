package org.example.aula13.exerciciosForEach;

public class Exercicio1 {
    // 1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each, um por linha.

    public static void main(String[] args) {
        String[] nomes = {"Anna", "Bia", "Gabriela", "Ivyh"};

        for (String nome : nomes) {
            System.out.println(nome);
        }
        // 5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal, usando o índice. Deixe os dois na mesma classe e compare.

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
