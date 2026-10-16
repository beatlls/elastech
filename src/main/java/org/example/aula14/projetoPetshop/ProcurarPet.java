package org.example.aula14.projetoPetshop;

import java.util.Scanner;

public class ProcurarPet implements Menu {

    @Override
    public void executar(Scanner sc, BancoDePets banco) {
        System.out.println("Qual pet você procura?");
        String nomeBuscado = sc.nextLine();
        CadastroPet cp = new CadastroPet();

        boolean achou = false;

        for (int i = 0; i < banco.total; i++) {
            if (banco.listaDePets[i].nome.equalsIgnoreCase(nomeBuscado)) {
                System.out.println("Encontrado: " + banco.listaDePets[i].nome + " (" + banco.listaDePets[i].especie + ") " + " - " + banco.listaDePets[i].peso + " kg - " + banco.listaDePets[i].porte);
                achou = true;
                break;
            }
        }

        if (!achou) {
            System.out.println("Pet não encontrado.");
        }
    }

}
