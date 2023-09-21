package org.example;

public class StatusBar implements Observador {
    @Override
    public void atualizar(String acao, double novoPreco) {
        System.out.println("StatusBar: Ação " + acao + " - Novo preço: " + novoPreco);
    }
}