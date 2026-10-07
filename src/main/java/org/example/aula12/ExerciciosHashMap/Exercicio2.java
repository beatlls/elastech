package org.example.aula12.ExerciciosHashMap;

import java.util.HashMap;

public class Exercicio2 {
    /* 2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
   Imprima outra vez e veja o que aconteceu com o tamanho.*/

    public static void main(String[] args) {
        HashMap<String, Double> mercado = new HashMap<>();

        mercado.put("Café", 5.00);
        System.out.println(mercado);
        mercado.put("Café", 7.50);
        System.out.println(mercado);
    }
}
