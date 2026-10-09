package org.example.aula12.exerciciosArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        // 5. Crie uma fila com três nomes e use contains para responder duas perguntas: se "Bia" está na fila e se "Zoe" está.

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Anna", "Bia", "Hyan"));

        if(fila.contains("Bia")) {
            System.out.println("Bia está na fila.");
        } else {
            System.out.println("Bia não está na fila.");
        }

        if(fila.contains("Zoe")) {
            System.out.println("Zoe está na fila.");
        } else {
            System.out.println("Zoe não está na fila.");
        }
    }
}
