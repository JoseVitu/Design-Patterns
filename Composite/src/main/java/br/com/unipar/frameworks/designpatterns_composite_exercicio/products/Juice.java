package br.com.unipar.frameworks.designpatterns_composite_exercicio.products;

public class Juice extends Product {

    public Juice(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    
}
