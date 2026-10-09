package org.example.aula12.exerciciosArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        // 4. Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Anna", "Bia", "Hyan"));

        while (!fila.isEmpty()) {
            String atendido = fila.poll();
            System.out.println("Atendendo: "+ atendido);
        }

        System.out.println("Fila vazia!");
    }
}
