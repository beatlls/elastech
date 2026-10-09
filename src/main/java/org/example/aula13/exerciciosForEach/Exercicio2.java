package org.example.aula13.exerciciosForEach;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    // 2. Crie um ArrayList com 5 notas e imprima todas usando for-each.
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        notas.addAll(List.of(6.7, 6.8, 8.9, 9.2, 7.2));

        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}
