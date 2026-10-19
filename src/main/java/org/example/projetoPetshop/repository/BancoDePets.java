package org.example.projetoPetshop.repository;

import org.example.projetoPetshop.model.Pet;

import java.util.ArrayDeque;

public class BancoDePets {
    public Pet[] listaDePets = new Pet[100];
    public int total = 0;
    public ArrayDeque<String> filaBanho = new ArrayDeque<>();
}
