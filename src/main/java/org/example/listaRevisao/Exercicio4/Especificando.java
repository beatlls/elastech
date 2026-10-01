package org.example.listaRevisao.Exercicio4;

public class Especificando {
    public static void main(String[] args) {
        Pet cachorro = new Pet();

        cachorro.nome = "Lili";
        cachorro.raca = "SRD";
        cachorro.peso = 9.6;

        Pet gato = new Pet();

        gato.nome = "Ximi";
        gato.raca = "Siamês";
        gato.peso = 5.2;

        System.out.println("O primeiro pet é um cachorro fêmea chamado " + cachorro.nome + " da raça " + cachorro.raca + " com o peso de " + cachorro.peso + "kg.");
        System.out.println("O segundo pet é uma gata chamada " + gato.nome + " da raça " + gato.raca + " com o peso de " + gato.peso + "kg.");
    }
}
