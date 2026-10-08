package org.example.aula12.exerciciosHashSet;

import java.util.HashSet;

public class Exercicio1 {
    /*1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
    repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
    com o repetido. */
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Anna");
        nomes.add("Bianca");
        nomes.add("Clara");
        nomes.add("Anna");

        System.out.println(nomes);
        System.out.println(nomes.size());
    }
}
