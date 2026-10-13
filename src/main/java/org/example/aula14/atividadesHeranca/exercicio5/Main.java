package org.example.aula14.atividadesHeranca.exercicio5;

public class Main {
    // 5. Faça uma cadeia de três níveis:
    //   - Funcionario, com o atributo nome e o método baterPonto()
    //   - Gerente extends Funcionario, com aprovarFerias(String quem)
    //   - Diretora extends Gerente, com definirMeta(String meta)
    //
    //   Na Main, crie uma Diretora, preencha o nome dela
    //   (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
    //
    //   Herança em cadeia: ela tem tudo que vem de cima.
    // 6. Crie duas interfaces:
    //   - Notificavel, com notificar(String mensagem)
    //   - Exportavel, com exportar()
    //
    //   Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
    //   extends Funcionario:
    //
    //   class Gerente extends Funcionario implements Notificavel, Exportavel
    //
    //    Na Main, crie um gerente, preencha o nome e chame os quatro
    //   métodos nele: baterPonto(), aprovarFerias(), notificar()
    //   e exportar().
    //
    //   UMA herança (extends), VÁRIAS interfaces (implements).
    //   Depois tente colocar uma segunda classe no extends:
    //   extends Funcionario, Pessoa
    //   Veja o que o Java responde.

    public static void main(String[] args) {
        Diretora carla = new Diretora();

        carla.nome = "Carla";
        carla.aprovarFerias("Bia");
        carla.definirMeta("Atualizar branch");

        Gerente hyan = new Gerente();

        hyan.nome = "Hyan";
        hyan.baterPonto();
        hyan.aprovarFerias("Bia");
        hyan.notificar("Atenção! Amanhã é feriado.");
        hyan.exportar();

    }
}
