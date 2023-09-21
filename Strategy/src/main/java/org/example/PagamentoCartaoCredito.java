package org.example;

public class PagamentoCartaoCredito implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito no valor de R$" + valor);
    }
}