package org.example.aula14.atividadesHeranca.exercicio5;

public class Diretora extends Gerente{
    void definirMeta(String meta) {
        System.out.printf("%s definiu a meta: %s.\n", nome, meta);
    }
}
