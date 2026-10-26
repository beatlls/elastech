package org.example.aula24.observer.atividadeObserver.atividade4;

public class Passageiro implements ObservadorVoo{
    @Override
    public void avisosVoo(String mensagem) {
        String s = "Vôo iniciado!";
        statusDoVoo(s);
        System.out.println("Passageiro avisado: " + statusDoVoo());
    }
}
