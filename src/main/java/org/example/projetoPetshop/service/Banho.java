package org.example.projetoPetshop.service;

public class Banho implements Servico {
    @Override
    public void executarServicos(String nomeDoPet) {
        System.out.println("Dando banho em " + nomeDoPet + "...");
    }
}
