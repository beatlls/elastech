package org.example.aula12.exerciciosHashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Exercicio2 {
    /* 2. Crie um HashSet de cores usando addAll. Depois use contains dentro
   de um if para avisar se a cor "verde" já está no conjunto ou não. */

    public static void main(String[] args) {
        HashSet<String> cores = new HashSet<>();

        cores.addAll(Arrays.asList("Vermelho", "Azul", "Amarelo", "Verde"));

        if (cores.contains("Verde")) {
            System.out.println("A cor verde já está no conjunto!");
        } else {
            System.out.println("A cor verde não está no conjunto.");
        }


    }
}
