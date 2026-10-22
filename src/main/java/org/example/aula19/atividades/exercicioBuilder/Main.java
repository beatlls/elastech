package org.example.aula19.atividades.exercicioBuilder;

public class Main {
    public static void main(String[] args) {
        Agendamento petA = Agendamento.builder().nomePet("Thor").servico("banho").horario("14h").perfume(true).laco(true).hidratacao(false).observacao("Alérgico a shampoo").desconto(10).build();

        Agendamento petB = Agendamento.builder().nomePet("Luna").servico("tosa").horario("10h").perfume(false).laco(false).hidratacao(false).observacao("Sem observação.").desconto(0.0).build();

        Agendamento petC = Agendamento.builder().nomePet("Mel").servico("banho").horario("16h").perfume(false).laco(false).hidratacao(true).observacao("Sem observação.").desconto(0.0).build();
    }
}
