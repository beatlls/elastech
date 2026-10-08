package org.example.aula12.exerciciosHashSet;

import java.util.HashSet;

public class Exercicio4 {
    /* 4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
   imprima de novo, junto com o tamanho. */

    public static void main(String[] args) {
        HashSet<String> cpf = new HashSet<>();

        cpf.add("080.999.333-90");
        cpf.add("200.111.444-00");
        cpf.add("222.567.344-78");

        System.out.println(cpf);

        cpf.remove("200.111.444-00");

        System.out.println(cpf);
        System.out.println(cpf.size());
    }
}
