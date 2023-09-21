package org.example;

public class PagamentoPaypal implements FormaPagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento via Paypal no valor de R$" + valor);
    }
}
