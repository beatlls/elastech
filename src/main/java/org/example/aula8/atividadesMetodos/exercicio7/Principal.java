package org.example.aula8.atividadesMetodos.exercicio7;

import java.util.Scanner;

import static org.example.aula8.atividadesMetodos.exercicio7.Metodo.saudacao;

public class Principal {
    // 7 — Crie dois métodos chamados saudacao:
    //
    //um sem parâmetro, que imprime "Olá!"
    //um que recebe um nome, e imprime "Olá, [nome]!"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        String saudar = saudacao(nome);

        saudacao();
    }
}
