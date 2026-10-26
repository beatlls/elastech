package org.example.aula14.atividadesPolimorfismo.exercicio2;

public class Painel {

    void exibir(String texto){
        System.out.println("Esse tipo exibir recebeu uma String: " + texto);
    }

    void exibir(int numeroInteiro) {
        System.out.println("Esse tipo exibir recebeu um int: " + numeroInteiro);
    }

    void exibir(boolean tipoBool) {
        System.out.println("Esse tipo exibir recebeu um boolean: " + tipoBool);
    }

    void exibir(double numeroDecimal) {
        System.out.println("Esse tipo exibir recebeu um double: " + numeroDecimal);
    }

}
