package org.example;

public class HamburgerAngus implements Hamburger {
    @Override
    public void preparar() {
        System.out.println("Preparando o Hamburger Angus.");
    }

    @Override
    public void cozinhar() {
        System.out.println("Cozinhando o Hamburger Angus.");
    }

    @Override
    public void montar() {
        System.out.println("Montando o Hamburger Angus.");
    }
}
