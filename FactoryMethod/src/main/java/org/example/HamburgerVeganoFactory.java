package org.example;

public class HamburgerVeganoFactory implements HamburgerFactory {
    @Override
    public Hamburger criarHamburger() {
        return new HamburgerVegano();
    }
}

