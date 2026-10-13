package org.example.aula14.atividadesInterfaces.exercicio4;

public class SMS implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
