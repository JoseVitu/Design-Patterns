package org.example;

public class Pedido {
    private double valorTotal;
    private FormaPagamento formaPagamento;

    public Pedido(double valorTotal, FormaPagamento formaPagamento) {
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
    }

    public void efetuarPagamento() {
        formaPagamento.realizarPagamento(valorTotal);
    }
}