package org.example;

public class HamburgerVegano implements Hamburger {
    @Override
    public void preparar() {
        System.out.println("Preparando o Hamburger Vegano.");
    }

    @Override
    public void cozinhar() {
        System.out.println("Cozinhando o Hamburger Vegano.");
    }

    @Override
    public void montar() {
        System.out.println("Montando o Hamburger Vegano.");
    }
}

