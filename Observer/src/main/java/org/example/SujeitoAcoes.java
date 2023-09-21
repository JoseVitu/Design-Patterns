package org.example;

import java.util.ArrayList;
import java.util.List;

public class SujeitoAcoes {
    private List<Observador> observadores = new ArrayList<>();
    private String nomeAcao;
    private double preco;

    public SujeitoAcoes(String nomeAcao, double preco) {
        this.nomeAcao = nomeAcao;
        this.preco = preco;
    }

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(nomeAcao, preco);
        }
    }
}

