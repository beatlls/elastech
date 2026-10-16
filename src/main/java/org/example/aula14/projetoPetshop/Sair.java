package org.example.aula14.projetoPetshop;

import java.util.Scanner;

public class Sair implements Menu{
    @Override
    public void executar(Scanner sc, BancoDePets banco) {
        System.out.println("Até logo!");
    }
}
