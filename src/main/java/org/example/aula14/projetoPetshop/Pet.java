package org.example.aula14.projetoPetshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;


    public String definirPorte() {
        if (peso < 10.0) {
            return "Porte Pequeno";
        } else if (peso >= 10.0 && peso <= 25.0) {
            return "Porte Médio";
        } else {
            return "Porte Grande";
        }
    }

    void emitirSom() {

    }

}
