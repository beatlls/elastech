package org.example.aulaArrayList.exercicios;

import java.util.List;
import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Anna", "Beatriz", "Hyan", "Mary"));
        System.out.println(nomes);
        nomes.set(2, "José");
        System.out.println(nomes);
    }
}
