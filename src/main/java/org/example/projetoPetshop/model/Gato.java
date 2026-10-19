package org.example.projetoPetshop.model;

public class Gato extends Pet {
    @Override
    public void emitirSom() {
        System.out.println(nome + " faz: miau, miau!");
    }
}
