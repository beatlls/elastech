package org.example.aula14.aulaHeranca;

public class Oftalmologista extends Medicos {

    void examinarOlho() {

    }

    void passarOculos() {

    }

    @Override
    void fazerCirurgia() {
        System.out.println("Cortar o olho.");
    }
}
