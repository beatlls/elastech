package org.example.aula14.atividadesHeranca.exercicio1;

public class Professora extends Pessoa{
    String disciplina;

    @Override
    void apresentar() {
        System.out.printf("Oi, sou %s e ensino %s\n", nome, disciplina);
    }

    void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s", nome, nota, aluna);
    }
}
