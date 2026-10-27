package org.example.aula14.atividadesPolimorfismo.exercicio6;

public class Main {
    public static void main(String[] args) {
        MeioDePagamento forma;
        forma = new Pix();
        forma.pagar(150.00);
        forma = new Boleto();
        forma.pagar(150.00);
    }
}
