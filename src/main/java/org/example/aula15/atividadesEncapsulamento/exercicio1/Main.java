package org.example.aula15.atividadesEncapsulamento.exercicio1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        System.out.println("Titular: " + c.getTitular());
        System.out.println("Saldo: " + c.getSaldo());

        c.setTitular("Anna");
        System.out.println("Titular: " + c.getTitular());

        c.setTitular("");
        System.out.println("Titular: " + c.getTitular());

        c.depositar(500.00);
        c.depositar(-100.00);
        c.sacar(2000.00);
        c.sacar(200.00);
        c.getNumeroConta();
        // c.setNumeroConta("999-Z");

        Produto p = new Produto();

        System.out.println(p.nome);
        System.out.println(p.preco);
        // System.out.println(p.codigoInterno);
    }
}
