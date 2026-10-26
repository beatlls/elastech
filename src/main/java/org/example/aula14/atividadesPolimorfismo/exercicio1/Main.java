package org.example.aula14.atividadesPolimorfismo.exercicio1;

import java.util.Scanner;

// 1. (mesma classe — muda a QUANTIDADE de parâmetros)
//
//   Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
//   - recebe um double (lado do quadrado)  -> lado * lado
//   - recebe dois double (base e altura)   -> base * altura
//   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio
//
//   Chame os três na Main e imprima os resultados.

public class Main extends Calculadora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("Digite um número para calcular o lado do quadrado: ");
        double ladoQuadrado = sc.nextDouble();

        Calculadora cA = new Calculadora();

        cA.calcularArea(ladoQuadrado);

        System.out.println("Digite o número da base: ");
        double base = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o número da altura: ");
        double altura = sc.nextDouble();

        Calculadora cB = new Calculadora();

        cB.calcularArea(base, altura);

        System.out.println("Digite um número para calcular o raio do círculo: ");
        int raioCirculo = sc.nextInt();

        Calculadora cC = new Calculadora();

        cC.calcularArea(raioCirculo);

        sc.close();
    }
}
