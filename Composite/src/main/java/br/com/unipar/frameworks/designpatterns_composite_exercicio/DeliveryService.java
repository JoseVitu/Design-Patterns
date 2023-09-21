package br.com.unipar.frameworks.designpatterns_composite_exercicio;


public class DeliveryService {
    
    private Box box;

    public DeliveryService() { }
    
    public void setupOrder(Box... boxes) {
        this.box = new CompositeBox(boxes);
    }
    
    public double calculateOrderPrice() {
        return box.calculatePrice();
    }
}
