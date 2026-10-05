package org.example.listaRevisao2.metodos;

public class Exercicio4 {
    static void calcularMedia(double n1, double n2) {
        System.out.printf("A média de %.2f e %.2f é: %.2f\n", n1, n2, ((n1 + n2) / 2));
    }

    public static void main(String[] args) {
        calcularMedia(2.45, 4.5);
    }
}
