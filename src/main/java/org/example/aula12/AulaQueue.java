package org.example.aula12;

import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {
    public static void main(String[] args) {
        /*
        .add("Ana");
        .peek();
        .poll();
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));
        */

        ArrayDeque<String> fila = new ArrayDeque<>();
        //É boa prática sempre verificar se a fila está vazia
        if (fila.isEmpty() != true) {

        }


        fila.add("Flora");
        fila.add("Ana");
        fila.addAll(List.of("Maria", "Natália", "Jamily", "Kerou", "Giovanna"));
        System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila);
    }
}
