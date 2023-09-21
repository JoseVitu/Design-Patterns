package org.example;

public class HamburgerAngusFactory implements HamburgerFactory {
    @Override
    public Hamburger criarHamburger() {
        return new HamburgerAngus();
    }
}
