package org.example.aulaOperadores;

public class ExercicioAritmetico2 {
    public static void main(String[] args) {
        //2- Crie variáveis para dois números decimais de valor a = 10 e
        // b = 3 e mostre na tela: soma, subtração, multiplicação, divisão
        // e resto.

        double a = 10;
        double b = 3;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        double resto;

        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = a / b;
        resto = a % b;


        System.out.println("Soma: " + soma + ". Subtração: " + subtracao
                + ". Multiplicação: " + multiplicacao + ". Divisão: "
                + divisao + ". Resto: " + resto + ".");
    }
}
