package org.example.aula14.atividadesHeranca.exercicio5;

public class Gerente extends Funcionario implements Notificavel, Exportavel {
    void aprovarFerias(String quem) {
        System.out.printf("%s aprovou as ferias de %s.\n", nome, quem);
    }

    @Override
    public void exportar() {

    }

    @Override
    public void notificar(String mensagem) {

    }
}
