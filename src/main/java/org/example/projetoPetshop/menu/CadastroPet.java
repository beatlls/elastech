package org.example.projetoPetshop.menu;

import org.example.projetoPetshop.model.Cachorro;
import org.example.projetoPetshop.model.Gato;
import org.example.projetoPetshop.model.Pet;
import org.example.projetoPetshop.repository.BancoDePets;

import java.util.Scanner;

public class CadastroPet implements Menu {
    @Override
    public void executar(Scanner sc, BancoDePets banco) {

        System.out.println("Digite o nome do seu pet: ");
        String nomeTemporario = sc.nextLine();

        System.out.println("Digite a espécie do seu pet: ");
        String especieTemporaria = sc.nextLine();

        System.out.println("Digite o peso do seu pet: ");
        double pesoTemporario = sc.nextDouble();
        sc.nextLine();

        Pet meuPet;

        if (especieTemporaria.equalsIgnoreCase("cachorro")) {
            meuPet = new Cachorro();
        } else if (especieTemporaria.equalsIgnoreCase("gato")) {
            meuPet = new Gato();
        } else {
            meuPet = new Pet();
        }

        meuPet.nome = nomeTemporario;
        meuPet.especie = especieTemporaria;
        meuPet.peso = pesoTemporario;
        meuPet.porte = meuPet.definirPorte();

        banco.listaDePets[banco.total] = meuPet;
        banco.total++;

        System.out.println("Pet cadastrado! Agora são " + banco.total + " pet(s).");
    }
}
