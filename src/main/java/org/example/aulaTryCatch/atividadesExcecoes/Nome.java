package org.example.aulaTryCatch.atividadesExcecoes;

public class Nome {
    public static void main(String[] args) {
        try {
            String nome = null;
            System.out.println(nome.length());
        } catch (NullPointerException npe) {
            System.out.println("O nome não foi preenchido.");
        }
    }
}
