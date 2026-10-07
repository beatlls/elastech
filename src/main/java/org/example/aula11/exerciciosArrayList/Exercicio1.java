package org.example.aula11.exerciciosArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.addAll(List.of("Beatriz", "Bianca", "Benício"));
        System.out.println(lista);
    }
}
