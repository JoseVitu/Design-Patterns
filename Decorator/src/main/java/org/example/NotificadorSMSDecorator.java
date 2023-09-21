package org.example;

class NotificadorSMSDecorator extends NotificadorDecorator {
    public NotificadorSMSDecorator(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarMensagem(String mensagem) {
        super.enviarMensagem(mensagem);
        // Lógica para enviar mensagem por SMS
        System.out.println("SMS: " + mensagem);
    }
}

