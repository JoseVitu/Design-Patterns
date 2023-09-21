package org.example;

public class PagamentoDinheiro implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento em dinheiro no valor de R$" + valor);
    }
}