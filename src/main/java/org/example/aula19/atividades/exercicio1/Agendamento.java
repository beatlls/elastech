package org.example.aula19.atividades.exercicio1;

public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar() {
        System.out.println("--- Dados do Agendamento ---");
        System.out.println("Nome do Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Com Perfume: " + (perfume ? "Sim" : "Não"));
        System.out.println("Com Laço: " + (laco ? "Sim" : "Não"));
        System.out.println("Com Hidratação: " + (hidratacao ? "Sim" : "Não"));
        System.out.println("Observação: " + (observacao.isEmpty() ? "Nenhuma" : observacao));
        System.out.println("Desconto: " + desconto + "%");
        System.out.println();
    }
}
