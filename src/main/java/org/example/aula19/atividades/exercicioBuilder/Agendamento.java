package org.example.aula19.atividades.exercicioBuilder;

import lombok.Builder;

@Builder
public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;


}
