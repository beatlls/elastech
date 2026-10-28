package org.example.aula19;

public class MongoDb implements BancoDeDados{
    String pessoa;

    @Override
    public String proibidoBarulhoAposDezHoras() {
        System.out.println("Barulho MongoDB");
        return "";
    }
}
