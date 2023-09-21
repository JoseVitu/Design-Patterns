package br.com.unipar.frameworks.designpatterns_adapter;

import br.com.unipar.frameworks.designpatterns_adapter.instaFilters.Caramel;

//adapter com composição
public class CaramelFilter implements Filter {
    
    private Caramel caramel;
    
    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }
    
    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
    
}
