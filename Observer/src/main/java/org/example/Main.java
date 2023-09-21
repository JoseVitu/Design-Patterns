package org.example;

public class Main {
    public static void main(String[] args) {
        SujeitoAcoes acao1 = new SujeitoAcoes("AAPL", 150.0);
        SujeitoAcoes acao2 = new SujeitoAcoes("GOOGL", 2500.0);

        Observador statusBar = new StatusBar();
        Observador stockListView = new StockListView();

        acao1.registrarObservador(statusBar);
        acao1.registrarObservador(stockListView);

        acao2.registrarObservador(statusBar);
        acao2.registrarObservador(stockListView);

        acao1.atualizarPreco(155.0);
        acao2.atualizarPreco(2600.0);
    }
}