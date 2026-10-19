package org.example.projetoPetshop.menu;

import org.example.projetoPetshop.repository.BancoDePets;

import java.util.Scanner;

public class Sair implements Menu {
    @Override
    public void executar(Scanner sc, BancoDePets banco) {
        System.out.println("Até logo!");
    }
}
