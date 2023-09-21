package org.example;

abstract class NotificadorDecorator implements Notificador {
    private Notificador notificador;

    public NotificadorDecorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void enviarMensagem(String mensagem) {
        notificador.enviarMensagem(mensagem);
    }
}