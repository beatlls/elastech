package org.example.aula11.exerciciosArrayList;

import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> lista = List.of("Maçã", "Maracujá", "Morango", "Banana");
        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println(lista.size());
    }
}
