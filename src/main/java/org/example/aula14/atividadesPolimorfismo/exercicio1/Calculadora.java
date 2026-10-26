package org.example.aula14.atividadesPolimorfismo.exercicio1;

public class Calculadora {
    void calcularArea(double ladoA) {
        System.out.println("Lado do quadrado: " + ladoA * ladoA);
    }

    void calcularArea(double ladoA, double ladoB) {
        System.out.println("Base e altura: " + (ladoA * ladoB));
    }

    void calcularArea(int raio) {
        System.out.println("Raio do círculo: " + (3.14159 * raio * raio));
    }
}
