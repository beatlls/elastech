package org.example.aula8.atividadesMetodos.exercicio6;

import static org.example.aula8.atividadesMetodos.exercicio6.Metodo.somar;
public class Principal {
    // 6 — Crie três métodos com o mesmo nome somar:
    //
    //um que recebe dois inteiros
    //um que recebe três inteiros
    //um que recebe dois decimais
    //
    //No main, chame os três e veja o Java escolher sozinho qual usar.

    public static void main(String[] args) {
        somar(2, 5);
        somar(3.5, 5.6);
        somar(3, 6, 8);
    }
}
