package org.example.aula14.atividadesPolimorfismo.exercicio6;

public class Pix implements MeioDePagamento{
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento com pix realizado com sucesso! Valor: %.2f reais.\n", valor);
    }
}
