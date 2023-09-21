package br.com.unipar.frameworks.designpatterns_adapter;

import br.com.unipar.frameworks.designpatterns_adapter.instaFilters.Caramel;

//adapter com herança
public class CaramelAdapter extends Caramel 
        implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
    
}
