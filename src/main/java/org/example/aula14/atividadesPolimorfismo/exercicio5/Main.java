package org.example.aula14.atividadesPolimorfismo.exercicio5;

public class Main {

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    public static void main(String[] args) {
        Aluna aluna = new Aluna();
        aluna.nome = "Ana";
        aluna.idade = 20;

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Camila";
        estagiaria.idade = 22;

        mostrarFicha(aluna);
        mostrarFicha(flora);
        mostrarFicha(estagiaria);
    }
}

