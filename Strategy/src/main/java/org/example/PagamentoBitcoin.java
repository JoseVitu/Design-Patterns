package org.example;

public class PagamentoBitcoin implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com Bitcoin no valor de R$" + valor);
    }
}
