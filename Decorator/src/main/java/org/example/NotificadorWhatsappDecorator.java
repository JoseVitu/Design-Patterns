package org.example;

class NotificadorWhatsAppDecorator extends NotificadorDecorator {
    public NotificadorWhatsAppDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        super.enviarMensagem(mensagem);

        System.out.println("WhatsApp: " + mensagem);
    }
}

