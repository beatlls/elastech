package org.example.aula7.atividadesArrays;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;


        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.length;

        System.out.println("A soma das notas fica: " + soma);
        System.out.println("E a média das notas fica: " + media);
    }
}
