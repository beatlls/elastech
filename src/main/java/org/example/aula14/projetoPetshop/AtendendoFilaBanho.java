package org.example.aula14.projetoPetshop;

import java.util.Scanner;

public class AtendendoFilaBanho implements Menu{
    @Override
    public void executar(Scanner sc, BancoDePets banco) {
        if (banco.filaBanho.isEmpty()) {
            System.out.println("A fila está vazia, não há pets para atender.");
        } else {
            String petSendoAtendido = banco.filaBanho.poll();
            System.out.println("Próximo da fila: " + petSendoAtendido);
            System.out.println("Atendendo " + petSendoAtendido + "...");
            System.out.println("Fila agora: " + banco.filaBanho);
        }
    }
}
