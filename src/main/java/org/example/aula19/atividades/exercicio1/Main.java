package org.example.aula19.atividades.exercicio1;
// EXERCÍCIO — CONSTRUTORES 🏗️
//
//1. Crie a classe Agendamento com TODOS estes atributos,
//   recebidos num construtor só:
//
//   - nomePet (String)
//   - servico (String)
//   - horario (String)
//   - perfume (boolean)
//   - laco (boolean)
//   - hidratacao (boolean)
//   - observacao (String)
//   - desconto (double)
//
//   Crie um método mostrar() que imprime tudo.
//
//   Na Main, crie 3 agendamentos:
//   a) Thor, banho, 14h, com perfume e laço, sem hidratação,
//      "alérgico a shampoo", 10% de desconto
//   b) Luna, tosa, 10h, sem nenhum extra, sem observação,
//      sem desconto
//   c) Mel, banho, 16h, só com hidratação, sem observação,
//      sem desconto


public class Main {
    public static void main(String[] args) {
        Agendamento petA = new Agendamento("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 10.0);
        Agendamento petB = new Agendamento("Luna", "tosa", "10h", false, false, false, "", 0.0);
        Agendamento petC = new Agendamento("Mel", "banho", "16h", false, false, true, "", 0.0);

        petA.mostrar();
        petB.mostrar();
        petC.mostrar();
    }
}