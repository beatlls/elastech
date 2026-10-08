package org.example.aula12.exerciciosHashSet;

import java.util.HashSet;

public class Exercicio5 {
    /* 5. Crie um HashSet com três frutas e percorra ele com for,
   imprimindo uma por linha. */

    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();

        frutas.add("Laranja");
        frutas.add("Maçã");
        frutas.add("Banana");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
