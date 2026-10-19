package org.example.projetoPetshop.service;

public class Consulta implements Servico {
    @Override
    public void executarServicos(String nomeDoPet) {
        System.out.println("Consultando pet (" + nomeDoPet + ")...");
    }
}
