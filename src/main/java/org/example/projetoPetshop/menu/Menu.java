package org.example.projetoPetshop.menu;

import org.example.projetoPetshop.repository.BancoDePets;

import java.util.Scanner;

public interface Menu {
    void executar(Scanner sc, BancoDePets banco);
}
