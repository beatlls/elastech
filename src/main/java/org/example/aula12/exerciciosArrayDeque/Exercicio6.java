package org.example.aula12.exerciciosArrayDeque;

import java.util.ArrayDeque;

public class Exercicio6 {
    public static void main(String[] args) {
        // 6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        //   - se estiver vazia  -> "Não tem ninguém na fila."
        //   - se tiver gente    -> "Próximo: [nome]"
        //   Depois adicione uma pessoa e teste de novo.

        ArrayDeque<String> fila = new ArrayDeque<>();

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

        fila.add("Hyan");

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }
    }
}
