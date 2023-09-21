package org.example;

public class StockListView implements Observador {
    @Override
    public void atualizar(String acao, double novoPreco) {
        System.out.println("StockListView: Ação " + acao + " - Novo preço: " + novoPreco);
    }
}
