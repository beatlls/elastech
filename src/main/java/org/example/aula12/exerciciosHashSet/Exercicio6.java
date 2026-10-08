package org.example.aula12.exerciciosHashSet;

import java.util.HashSet;

public class Exercicio6 {
    /* 6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
   imprima o isEmpty() de novo. */

    public static void main(String[] args) {
        HashSet<Integer> vazio = new HashSet<>();

        System.out.println(vazio.isEmpty());

        vazio.add(20);

        System.out.println(vazio);
    }
}
