package org.example.aula14.atividadesInterfaces.exercicio5;

import java.util.ArrayList;

public class Main {
    // 5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
    //   Crie Carro e Moto implementando os dois. Coloque numa lista e
    //   percorra com for-each chamando os dois métodos em cada um.

    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro());
        veiculos.add(new Moto());

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }
    }
}
