package org.example.aula14.atividadesPolimorfismo.exercicio4;

public class Main {
    public static void main(String[] args) {
        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Bianca";
        estagiaria.idade = 20;

        Pessoa pessoa = estagiaria;

        pessoa.apresentar();

    }
}
