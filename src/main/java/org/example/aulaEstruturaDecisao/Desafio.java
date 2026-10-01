package org.example.aulaEstruturaDecisao;

public class Desafio {
    public static void main(String[] args) {
        // Desafio: Crie uma variável com 3785 segundos. Mostre quantos
        // minutos inteiros isso dá e quantos segundos sobram.

        int segundos = 3785;
        int minutos = 0;
        int segundosSobrando = 0;

        minutos = segundos / 60;
        segundosSobrando = segundos % 60;


        System.out.println("Os minutos são: " + minutos + " minutos, " +
                "e os segundos que sobram são: " + segundosSobrando +
                " segundos.");
    }
}
