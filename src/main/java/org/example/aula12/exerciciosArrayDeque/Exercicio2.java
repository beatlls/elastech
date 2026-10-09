package org.example.aula12.exerciciosArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class Exercicio2 {
    // 2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e imprima a fila logo depois. Repare que ela não mudou.

    public static void main(String[] args) {
        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("Anna", "Patricia", "Bruna", "Hyan"));

        fila.peek();
        System.out.println(fila);

    // 3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila depois. Compare com o exercício 2.

        fila.poll();
        System.out.println(fila);
    }
}
