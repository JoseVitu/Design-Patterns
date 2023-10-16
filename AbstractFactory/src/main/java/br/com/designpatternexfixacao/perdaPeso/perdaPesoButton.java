package br.com.designpatternexfixacao.perdaPeso;

import br.com.designpatternexfixacao.abstrasctFactory.Button;


public class perdaPesoButton implements Button {

    @Override
    public void render() {
    
        System.out.println("SELECIONOU PERCA DE PESO!!!");
        
    }
    
}
