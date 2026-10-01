package org.example.exerciciosAula3;

public class OperadoresRelacionais1 {
    public static void main(String[] args) {
        /*
        1- Crie variáveis para as notas de duas alunas. Mostre na tela
         o resultado de: são iguais, são diferentes, a primeira é maior,
         a primeira é menor para quando:
        - a = 10, b = 3
        - a = 3, b = 10
        - a = 5, b = 5
         */

        int notaA = 0;
        int notaB = 0;

        notaA = 10;
        notaB = 3;

        if (notaA == notaB) {
            System.out.println("As notas são iguais.");
        } else {
            System.out.println("As notas são diferentes.");
        }

        if (notaA > notaB) {
            System.out.println("A primeira nota é maior que a segunda.");
        } else if (notaA < notaB) {
            System.out.println("A segunda nota é maior que a primeira.");
        } else {
            System.out.println("São iguais ou a operação falhou.");
        }

        notaA = 3;
        notaB = 10;

        if (notaA == notaB) {
            System.out.println("As notas são iguais.");
        } else {
            System.out.println("As notas são diferentes.");
        }

        if (notaA > notaB) {
            System.out.println("A primeira nota é maior que a segunda.");
        } else if (notaA < notaB) {
            System.out.println("A segunda nota é maior que a primeira.");
        } else {
            System.out.println("São iguais ou a operação falhou.");
        }

        notaA = 5;
        notaB = 5;

        if (notaA == notaB) {
            System.out.println("As notas são iguais.");
        } else {
            System.out.println("As notas são diferentes.");
        }

        if (notaA > notaB) {
            System.out.println("A primeira nota é maior que a segunda.");
        } else if (notaA < notaB) {
            System.out.println("A segunda nota é maior que a primeira.");
        } else {
            System.out.println("São iguais ou a operação falhou.");
        }
    }
}
