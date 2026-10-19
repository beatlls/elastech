package org.example.projetoPetshop.model;

public class Cachorro extends Pet {
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: au, au!");
    }
}
