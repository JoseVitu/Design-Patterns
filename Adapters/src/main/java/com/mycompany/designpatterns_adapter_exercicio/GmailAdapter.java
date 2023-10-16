package com.mycompany.designpatterns_adapter_exercicio;

import com.mycompany.designpatterns_adapter_exercicio.gmailClient.GmailClient;

public class GmailAdapter implements EmailProvider {

    private GmailClient gmailClient;

    public GmailAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    GmailAdapter() {
    }

    @Override
    public void connect() {
        gmailClient.login();
    }

    @Override
    public void fetchEmails() {
        gmailClient.getEmails();
    }

    @Override
    public void disconnect() {
        gmailClient.logout();
    }
}
