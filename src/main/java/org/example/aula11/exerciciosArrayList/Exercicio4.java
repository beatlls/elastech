package org.example.aula11.exerciciosArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<String> cidades = new ArrayList<>(List.of("Cambé", "Londrina", "Curitiba", "Arapongas"));
        System.out.println(cidades);
        cidades.remove(1);
        System.out.println(cidades);
    }
}
