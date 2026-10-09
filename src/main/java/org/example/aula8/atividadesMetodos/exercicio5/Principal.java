package org.example.aula8.atividadesMetodos.exercicio5;

import java.util.Scanner;
import static org.example.aula8.atividadesMetodos.exercicio5.Metodo.ehMaiorDeIdade;

public class Principal {
    // 5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println(ehMaiorDeIdade(idade));
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println(ehMaiorDeIdade(idade));
            System.out.println("Você não é maior de idade.");
        }
    }
}
