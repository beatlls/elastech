package org.example.aula13;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class AulaForEach {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>(List.of("Macaco", "Leão", "Guaxinim"));

        //Maneira anterior que aprendemos:
        /* for (int i = 0; i < animais.size(); i++) {
            System.out.println(animais.get(i));
        } */

        // Agora:
        for (String animal : animais) {
            System.out.println(animal);
        }
    }
}
