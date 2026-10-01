package org.example.aulaOperadores;

public class Concatenacao {
    public static void main(String[] args) {
        String nome = "Beatriz";
        String cep = "86191-650";
        String cidade = "Cambé";
        String telefone = "(43)99960-9951";
        String profissao = "Desempregada";

        int idade = 20;
        int anoNascimento = 2005;

        double altura = 1.59;
        double peso = 55;
        double temperatura = 21;
        double nota = 10.0;

        boolean ehFumante = false;
        boolean temCarteira = true;

        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e nasci em " + anoNascimento + ". " + "Tenho " + altura + " de altura e peso " + peso + " quilos. Eu não fumo (" + ehFumante + "), mas tenho carteira! (" + temCarteira + "). Atualmente, moro em " + cidade + ", no CEP " + cep + ", onde está " + temperatura + " graus agora.");
    }
}
