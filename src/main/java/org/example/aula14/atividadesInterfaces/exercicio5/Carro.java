package org.example.aula14.atividadesInterfaces.exercicio5;

public class Carro implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Ligando o carro...");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro...");
    }
}
