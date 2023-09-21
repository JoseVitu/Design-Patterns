package org.example;

class NotificadorEmail implements Notificador {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("E-mail: " + mensagem);
    }
}
