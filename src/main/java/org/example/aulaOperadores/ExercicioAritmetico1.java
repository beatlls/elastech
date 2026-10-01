package org.example.aulaOperadores;

public class ExercicioAritmetico1 {
    public static void main(String[] args) {
        //0- Rode esse código:
        System.out.println("2 + 2 = " + 2 + 2);
        //Agora rode:
        System.out.println("2 + 2 = " + (2 + 2));
        //Explique em um comentário por que deram resultados diferentes.

        // O primeiro é interpretado como string, portanto, ele concatena
        // os dois números, já o segundo soma, por conta dos parênteses,
        // indicando uma operação.

        // 1- Crie variáveis para dois números inteiros de valor a = 10 e
        // b = 3 e mostre na tela: soma, subtração, multiplicação, divisão
        // e resto.

        int a = 10;
        int b = 3;
        int soma = 0;
        int subtracao = 0;
        int multiplicacao;
        int divisao;
        int resto;

        soma  = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = a / b;
        resto = a % b;

        System.out.println("Soma: " + soma + ". Subtração: " + subtracao
                + ". Multiplicação: " + multiplicacao + ". Divisão: "
                + divisao + ". Resto: " + resto + ".");
    }
}
