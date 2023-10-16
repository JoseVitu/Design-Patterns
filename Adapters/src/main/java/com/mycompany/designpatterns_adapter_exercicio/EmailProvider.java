package com.mycompany.designpatterns_adapter_exercicio;

public interface EmailProvider {

    void connect();

    void fetchEmails();

    void disconnect();
}
