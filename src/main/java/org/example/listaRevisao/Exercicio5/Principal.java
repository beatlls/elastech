package org.example.listaRevisao.Exercicio5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Cadastro de produtos:");

            System.out.println("Digite o nome do produto: ");
            String nomeDigitado = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double precoDigitado = scanner.nextDouble();

            scanner.nextLine();

            Produto produtoAtual = new Produto();
            produtoAtual.nome = nomeDigitado;
            produtoAtual.preco = precoDigitado;

            if(produtoAtual.preco > 100) {
                System.out.printf("Produto: %s | Preço: R$ %.2f. Produto caro!\n", produtoAtual.nome, produtoAtual.preco);
            } else {
                System.out.printf("Produto: %s | Preço: R$ %.2f. Produto com preço acessível!", produtoAtual.nome, produtoAtual.preco);
            }
        }

        scanner.close();
    }
}
