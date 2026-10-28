package org.example.aula19;

public class MySql implements BancoDeDados {
    @Override
    public String proibidoBarulhoAposDezHoras() {
        System.out.println("Barulho MySQL");
        return "";
    }
}
