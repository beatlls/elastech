package org.example.aula14.atividadesInterfaces.exercicio4;

import java.util.ArrayList;

public class Main {
    // 4. Crie uma interface Notificacao com o método enviar(String mensagem).
    //   Crie duas classes que implementam ela: Email e SMS. Cada uma
    //   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
    //   e percorra com for-each, enviando a mesma mensagem.
    //
    //   Saída esperada:
    //   E-mail enviado: Sua compra foi aprovada!
    //   SMS enviado: Sua compra foi aprovada!

    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        String mensagem = "Sua compra foi aprovada!";

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar(mensagem);
        }
    }
}
