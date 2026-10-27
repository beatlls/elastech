package org.example.aula14.atividadesPolimorfismo.exercicio6;

public class Boleto implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento com boleto realizado com sucesso! Valor: %.2f reais.\n", valor);
    }
}
