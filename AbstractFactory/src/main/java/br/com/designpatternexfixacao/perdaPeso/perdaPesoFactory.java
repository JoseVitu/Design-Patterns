package br.com.designpatternexfixacao.perdaPeso;

import br.com.designpatternexfixacao.abstrasctFactory.Button;
import br.com.designpatternexfixacao.abstrasctFactory.TextBox;
import br.com.designpatternexfixacao.abstrasctFactory.WidgetFactory;


public class perdaPesoFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new perdaPesoButton();
    }

    @Override
    public TextBox createTextBox() {
        return new perdaPesoTextBox();
    }
    
    
    
}
