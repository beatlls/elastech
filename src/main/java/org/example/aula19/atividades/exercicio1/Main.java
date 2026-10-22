package org.example.aula19.atividades.exercicio1;

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