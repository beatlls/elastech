package org.example.aula14.aulaHeranca;

public class AulaHeranca extends FuncionariosHospital {
    public static void main(String[] args) {
        Medicos mariaMedica = new Medicos();

        mariaMedica.baterPonto();
        mariaMedica.dormem();
        mariaMedica.fazerCirurgia();
        mariaMedica.darAtestado();
        mariaMedica.passarRaiva();
        mariaMedica.pedeExame();


        FuncionariosHospital joaoDoRh = new FuncionariosHospital();

        Oftalmologista alineOftalmologista = new Oftalmologista();


    }
}
