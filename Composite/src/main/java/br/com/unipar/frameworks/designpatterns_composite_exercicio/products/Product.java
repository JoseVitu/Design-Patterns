package br.com.unipar.frameworks.designpatterns_composite_exercicio.products;

import br.com.unipar.frameworks.designpatterns_composite_exercicio.Box;
import lombok.Data;

      
@Data
public abstract class Product implements Box {

    protected final String title;
    protected final double price;
    
}
