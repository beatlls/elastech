package org.example.aula12.exerciciosArrayDeque;

import java.util.ArrayDeque;

public class Exercicio1 {
    // 1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.

    public static void main(String[] args) {
        ArrayDeque<String> nomes = new ArrayDeque<>();

        nomes.add("Anna");
        nomes.add("Beatriz");
        nomes.add("Clara");

        System.out.println(nomes);
        System.out.println(nomes.size());
    }
}
