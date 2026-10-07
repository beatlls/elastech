package org.example.aula12.ExerciciosHashMap;

import java.util.HashMap;

public class Exercicio5 {
    /* 5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
   Remova uma delas e imprima de novo. */

    public static void main(String[] args) {
        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Anna", 5.9);
        notas.put("Bianca", 8.0);
        notas.put("Camila", 7.5);

        System.out.println(notas);
        System.out.println(notas.size());

        notas.remove("Anna");
        System.out.println(notas);
        System.out.println(notas.size());
    }
}
