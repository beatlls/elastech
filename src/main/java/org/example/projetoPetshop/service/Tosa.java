package org.example.projetoPetshop.service;

public class Tosa implements Servico {
    @Override
    public void executarServicos(String nomeDoPet) {
        System.out.println("Fazendo a tosa em " + nomeDoPet + "...");
    }
}
