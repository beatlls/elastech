package org.example.aula24.observer.atividadeObserver.atividade4;

public class Passageiro implements ObservadorVoo{
    @Override
    public String statusDoVoo() {
        System.out.println("Vôo liberado!");
        return "";
    }

    @Override
    public void avisosVoo(String mensagem) {
        System.out.println("Passageiro avisado: " + statusDoVoo());
    }
}
