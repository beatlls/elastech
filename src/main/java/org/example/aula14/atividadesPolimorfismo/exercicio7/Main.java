package org.example.aula14.atividadesPolimorfismo.exercicio7;

import org.example.aula14.atividadesPolimorfismo.exercicio7.Estagiaria;
import org.example.aula14.atividadesPolimorfismo.exercicio7.Aluna;
import org.example.aula14.atividadesPolimorfismo.exercicio7.Professora;

public class Main {
    public static void main(String[] args) {
        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 20;

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Camila";
        estagiaria.idade = 22;

        ana.apresentar();
        estagiaria.apresentar();
        flora.apresentar();
    }
}
