package br.com.unipar.frameworks.designpatterns_adapter;

public class VividFilter implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Filtro Vivido Aplicado!");
    }
    
}
