package org.example.aulaArrayList.exercicios;

import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Anna", "Aurora", "Beatriz", "Maria", "Clara", "Denise");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + ":" + nomes.get(i));
        }
    }
}
