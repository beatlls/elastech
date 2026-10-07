package org.example.aula12.ExerciciosHashMap;

import java.util.HashMap;

public class Exercicio4 {
    /* 4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
   Use getOrDefault para mostrar a quantidade de um produto que existe
   e de um que não existe (devolvendo 0). Depois tente com get normal
   no que não existe e compare. */

    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Camiseta", 9);
        estoque.put("Calça", 20);

        System.out.println(estoque.getOrDefault("Camiseta", 9));
        System.out.println(estoque.getOrDefault("Blusa", 8));

        System.out.println(estoque.get("Camiseta"));
        System.out.println(estoque.get("Blusa"));
    }
}
