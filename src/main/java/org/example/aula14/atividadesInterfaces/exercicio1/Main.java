package org.example.aula14.atividadesInterfaces.exercicio1;

// 1. Crie uma interface Animal com o método emitirSom().
//   Crie a classe Cachorro que implementa ela e imprime "Au au!".
//   Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
//
//2. Agora acrescente a classe Gato, que implementa a mesma interface e
//   imprime "Miau!". Na main, declare as duas variáveis como Animal:
//
//   Animal bidu = new Cachorro();
//   Animal salem= new Gato();
//
//   Chame emitirSom() nas duas.
// 3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
//   e percorra com for-each chamando emitirSom(). Repare que não
//   tem nenhum if. Dica:
//
//animais.add(new Cachorro());

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais) {
            animal.emitirSom();
        }

    }
}
