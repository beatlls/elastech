package org.example.aula8.atividadesMetodos.exercicio4;

import java.util.Scanner;
import static org.example.aula8.atividadesMetodos.exercicio4.Metodo.calcularMedia;

public class Principal {
    // 4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double num2 = sc.nextDouble();

        double resultado = calcularMedia(num1, num2);
        System.out.printf("A média de " + num1 + " e " + num2  + " é: " + resultado);

        sc.close();
    }
}
