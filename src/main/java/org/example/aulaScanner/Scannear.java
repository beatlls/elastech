package org.example.aulaScanner;
import java.util.Scanner;

public class Scannear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        int senha = 0;

        System.out.println("Digite sua senha: ");
        scanner.nextInt();

        while (senha != 1234) {
            System.out.println("Senha errada! Digite a senha: ");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso liberado!");

    }
}
