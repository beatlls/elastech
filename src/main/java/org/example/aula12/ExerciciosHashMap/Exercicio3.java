package org.example.aula12.ExerciciosHashMap;

import java.util.HashMap;

public class Exercicio3 {
    /* 3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
   dentro de um if para mostrar o telefone de alguém que está na agenda
   e de alguém que não está.*/

    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("Beatriz", "(12)34567-8900");
        agenda.put("Hyan", "(90)87654-3210");

        String pessoaExistente = "Beatriz";
        if (agenda.containsKey(pessoaExistente)) {
            System.out.println(pessoaExistente + " está na agenda! Telefone: " + agenda.get(pessoaExistente)) ;
        } else {
            System.out.println("A pessoa não está na agenda.");
        }

        String pessoaNaoExistente = "Gabriela";

        if (agenda.containsKey(pessoaNaoExistente)) {
            System.out.println(pessoaNaoExistente + " está na agenda. Telefone: " + agenda.get(pessoaNaoExistente));
        } else {
            System.out.println(pessoaNaoExistente + " não está na agenda.");
        }
    }
}
