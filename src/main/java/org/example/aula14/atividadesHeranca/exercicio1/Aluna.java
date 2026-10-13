package org.example.aula14.atividadesHeranca.exercicio1;

public class Aluna extends Pessoa{
    String curso;

    void estudar() {
        System.out.println(nome + " está estudando " + curso);
    }
}
