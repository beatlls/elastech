package org.example.projetoPetshop.model;

public class Pet {
    public String nome;
    public String especie;
    public double peso;
    public String porte;


    public String definirPorte() {
        if (peso < 10.0) {
            return "Porte Pequeno";
        } else if (peso >= 10.0 && peso <= 25.0) {
            return "Porte Médio";
        } else {
            return "Porte Grande";
        }
    }

    public void emitirSom() {

    }

}
