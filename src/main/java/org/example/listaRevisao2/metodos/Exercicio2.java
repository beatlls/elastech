package org.example.listaRevisao2.metodos;

// Crie saudacao(String nome) que imprime "Olá, [nome]!" . Chame três vezes com nomes diferentes.

public class Exercicio2 {
    static void saudacao(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    public static void main(String[] args) {
        saudacao("Beatriz");
        saudacao("Hyan");
        saudacao("Mary");
    }
}
