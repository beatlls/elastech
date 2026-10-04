package org.example.aulaTryCatch.atividadesExcecoes;

public class Nomes {
    public static void main(String[] args) {
        try {
            String[] nomes = {"Alice", "Livia", "Isabella"};

            System.out.println(nomes[5]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Essa posição não existe.");
        } finally {
            System.out.println("O programa continua funcionando.");
        }


    }
}
