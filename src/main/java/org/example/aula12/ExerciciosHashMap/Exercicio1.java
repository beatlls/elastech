package org.example.aula12.ExerciciosHashMap;

import java.util.HashMap;

public class Exercicio1 {
    /* 1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
   inteiro e depois use get para mostrar a idade de uma delas.*/
    public static void main(String[] args) {
        HashMap<String, Integer> idades = new HashMap<>();

        idades.put("Beatriz", 20);
        idades.put("Hyan", 23);
        idades.put("Mary", 47);

        System.out.println(idades.get("Beatriz"));

    }
}
