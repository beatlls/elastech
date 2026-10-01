package org.example.aula7.atividadesArrays;

import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer [] numeros = new Integer [5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");

            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Seus números em ordem decrescente: ");
        System.out.println(Arrays.toString(numeros));

        sc.close();
    }
}
