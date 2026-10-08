package org.example.aula12.exerciciosHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio3 {
    /* 3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
   tirar os repetidos. Imprima os dois e compare. */

    public static void main(String[] args) {
        ArrayList<String> nomesRepetidos = new ArrayList<>();

        nomesRepetidos.add("Anna");
        nomesRepetidos.add("Anna");
        nomesRepetidos.add("Anna");
        nomesRepetidos.add("Bianca");
        nomesRepetidos.add("Bianca");
        nomesRepetidos.add("Clara");
        System.out.println(nomesRepetidos);

        HashSet<String> nomes = new HashSet<>();

        nomes.addAll(nomesRepetidos);

        System.out.println(nomes);
    }
}
