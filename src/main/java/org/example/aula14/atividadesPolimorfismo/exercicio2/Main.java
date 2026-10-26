package org.example.aula14.atividadesPolimorfismo.exercicio2;

public class Main extends Painel{
    public static void main(String[] args) {
        Painel painel = new Painel();

        painel.exibir("Olá, me chamo Beatriz!");
        painel.exibir(32);
        painel.exibir(true);
        painel.exibir(12.5);
    }
}
