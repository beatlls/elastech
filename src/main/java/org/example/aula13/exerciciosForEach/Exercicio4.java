package org.example.aula13.exerciciosForEach;

public class Exercicio4 {
    // 4. Com um array de nomes, use for-each e um if para contar quantos
    //   têm mais de 5 letras. Mostre o total. Dica: usem o método length.

    public static void main(String[] args) {
        String[] nomes = {"Beatriz", "Bianca", "Carla", "José", "Hyan", "Maria", "Gabriela"};
        int total = 0;

        for (String nome : nomes) {
            if (nome.length() > 5) {
                total++;
            }
        }
        System.out.println("Total de nomes com mais de 5 letras: " + total);
    }
}
