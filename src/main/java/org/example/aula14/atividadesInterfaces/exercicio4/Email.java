package org.example.aula14.atividadesInterfaces.exercicio4;

public class Email implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}
