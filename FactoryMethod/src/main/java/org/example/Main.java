package org.example;

public class Main {
    public static void main(String[] args) {
        HamburgerFactory factoryAngus = new HamburgerAngusFactory();
        Hamburger angus = factoryAngus.criarHamburger();

        HamburgerFactory factoryVegano = new HamburgerVeganoFactory();
        Hamburger vegano = factoryVegano.criarHamburger();

        System.out.println("Preparando o pedido:");
        angus.preparar();
        angus.cozinhar();
        angus.montar();

        System.out.println("\nPreparando o pedido:");
        vegano.preparar();
        vegano.cozinhar();
        vegano.montar();
    }
}
