package org.example.aulaOperadores;

public class ExercicioConcatenacao2 {
    public static void main(String[] args) {
        // 2 — Crie variáveis para o nome de um produto
        // ("Caneca"), o preço (12.50) e a quantidade
        // (4). Mostre: "Comprei 4 unidades de Caneca
        // por R$ 12.5 cada. Total: R$ 50.0"

        String produto = "Caneca";
        double preco = 12.50;
        double quantidade = 0;
        double quantasComprei = 4;

        quantidade = preco * quantasComprei;

        System.out.println("Comprei " + quantasComprei
                + " unidades de Caneca por R$" + preco + " cada." +
                " Total R$" + quantidade);
    }
}
