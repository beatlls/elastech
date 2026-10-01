package org.example.EstruturaDecisao;

public class EstruturaDecisao2 {
    public static void main(String[] args) {
        // 2 — Crie variáveis para o saldo da conta (R$ 500.00) e o
        // valor de uma compra (R$ 320.00). Se o saldo for suficiente,
        // mostre "Compra aprovada!" e o saldo restante. Se não for,
        // mostre "Saldo insuficiente" e quanto está faltando.

        double saldoConta = 500.00;
        double valorCompra = 320.00;

        if (saldoConta >= valorCompra) {
            System.out.println("Compra aprovada! Seu saldo atual é de: " + (saldoConta - valorCompra));
        } else {
            System.out.println("Saldo insuficiente. Seu saldo é de: " + (valorCompra - saldoConta));
        }


    }
}
