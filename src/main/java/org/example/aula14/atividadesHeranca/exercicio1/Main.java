package org.example.aula14.atividadesHeranca.exercicio1;

//1. Crie a classe Pessoa com os atributos nome e idade, e o método
//   apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
//
//   Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
//
//   Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
//
//   Repare: você não escreveu nome, idade nem apresentar() na Aluna,
//   e os três funcionaram.
//
//2. Acrescente na Aluna o atributo curso e o método estudar(), que
//   imprime "[nome] está estudando [curso]."
//
//   Preencha os três atributos no objeto e chame os dois métodos.
//
//   Repare que o estudar() usa o nome, que veio da mãe.
//
//3. Crie a classe Professora, também filha de Pessoa, com o atributo
//   disciplina e o método lancarNota(String aluna, double nota), que
//   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
//   com %.1f.
//
//      Na Main, crie uma aluna e uma professora, preencha os atributos de
//   cada objeto e chame os métodos das duas.
//
//4. Na Professora, sobrescreva o apresentar() usando @Override, pra
//   imprimir "Oi, sou [nome] e ensino [disciplina]."
//
//   Chame apresentar() na aluna e na professora e compare as saídas.
public class Main extends Aluna{
    public static void main(String[] args) {
        Aluna a = new Aluna();

        a.nome = "Maria";
        a.idade = 23;
        a.curso = "Desenvolvimento Java";

        a.apresentar();
        a.estudar();

        Professora b = new Professora();

        b.nome = "Flora";
        b.disciplina = "Desenvolvimento Java";
        b.apresentar();
        b.lancarNota("Gaby", 8.9);

    }
}
