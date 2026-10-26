package org.example.aula14.atividadesPolimorfismo.exercicio3;

public class Main {
    public static void main(String[] args) {
        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Aluna ana = new Aluna();
        ana.nome = "Ana";
        ana.idade = 20;
        ana.matricula = "19001";

        flora.lancarNota(ana.nome, 9.5);
        ana.estudar();
    }
}
