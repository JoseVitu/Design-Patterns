package org.example;

public class Main {
    public static void main(String[] args) {
        double valorPedido = 100.0;

        FormaPagamento pagamentoDinheiro = new PagamentoDinheiro();
        FormaPagamento pagamentoCartao = new PagamentoCartaoCredito();
        FormaPagamento pagamentoPaypal = new PagamentoPaypal();
        FormaPagamento pagamentoBitcoin = new PagamentoBitcoin();

        Pedido pedido1 = new Pedido(valorPedido, pagamentoDinheiro);
        pedido1.efetuarPagamento();

        Pedido pedido2 = new Pedido(valorPedido, pagamentoCartao);
        pedido2.efetuarPagamento();

        Pedido pedido3 = new Pedido(valorPedido, pagamentoPaypal);
        pedido3.efetuarPagamento();

        Pedido pedido4 = new Pedido(valorPedido, pagamentoBitcoin);
        pedido4.efetuarPagamento();
    }
}
