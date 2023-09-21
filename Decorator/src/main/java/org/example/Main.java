package org.example;

public class Main {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorEmail();

        notificador = new NotificadorSMSDecorator(notificador);

        notificador = new NotificadorWhatsAppDecorator(notificador);

        notificador.enviarMensagem("Seu pedido está a caminho!");
    }
}
