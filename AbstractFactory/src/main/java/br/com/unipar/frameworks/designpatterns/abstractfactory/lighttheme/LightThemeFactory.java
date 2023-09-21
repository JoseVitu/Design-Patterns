package br.com.unipar.frameworks.designpatterns.abstractfactory.lighttheme;

import br.com.unipar.frameworks.designpatterns.abstractfactory.Button;
import br.com.unipar.frameworks.designpatterns.abstractfactory.TextBox;
import br.com.unipar.frameworks.designpatterns.abstractfactory.WidgetFactory;


public class LightThemeFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new LightThemeTextBox();
    }
    
}
