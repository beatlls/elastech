package org.example.projetoPetshop.menu;

import org.example.projetoPetshop.service.Banho;
import org.example.projetoPetshop.service.Consulta;
import org.example.projetoPetshop.repository.BancoDePets;
import org.example.projetoPetshop.service.Servico;
import org.example.projetoPetshop.service.Tosa;

import java.util.ArrayList;
import java.util.Scanner;

public class RealizarServicos implements Menu {
    @Override
    public void executar(Scanner sc, BancoDePets banco) {
        System.out.println("Nome do Pet: ");
        String nomeDoPet = sc.nextLine();

        ArrayList<Servico> listaServicos = new ArrayList<>();
        listaServicos.add(new Banho());
        listaServicos.add(new Tosa());
        listaServicos.add(new Consulta());

        for (Servico servicoAtual : listaServicos) {
            servicoAtual.executarServicos(nomeDoPet);
        }
    }
}
