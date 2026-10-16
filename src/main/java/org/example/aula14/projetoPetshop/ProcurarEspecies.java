package org.example.aula14.projetoPetshop;

import java.util.HashSet;
import java.util.Scanner;

public class ProcurarEspecies implements Menu{
    @Override
    public void executar(Scanner sc, BancoDePets banco) {
        HashSet<String> especiesCadastradas = new HashSet<>();

        for (int i = 0; i < banco.total; i++) {
            especiesCadastradas.add(banco.listaDePets[i].especie);
        }

        System.out.println("=== ESPÉCIES CADASTRADAS");

        for(String especie : especiesCadastradas) {
            System.out.println(" - " + especie);
        }

        System.out.println("\n Total de espécies diferentes: " + especiesCadastradas.size());
    }
}
