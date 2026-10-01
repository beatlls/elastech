package org.example.EstruturaDecisao;

public class EstruturaDecisao4 {
    public static void main(String[] args) {
        // 4 — Crie variáveis idade (17) e temAutorizacao (true).
        // Mostre se a pessoa pode entrar na festa: precisa ter 18 anos
        // ou ter autorização. Faça o mesmo para
        //precisa ter 18 anos e ter autorização.

        int idade = 17;
        boolean temAutorizacao = true;

        if (idade >= 18 || temAutorizacao == true) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso bloqueado.");
        }

        if (idade >= 18 && temAutorizacao) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso bloqueado.");
        }
    }
}
