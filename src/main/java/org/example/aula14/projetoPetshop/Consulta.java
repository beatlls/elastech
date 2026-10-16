package org.example.aula14.projetoPetshop;

public class Consulta implements Servico{
    @Override
    public void executarServicos(String nomeDoPet) {
        System.out.println("Consultando pet (" + nomeDoPet + ")...");
    }
}
