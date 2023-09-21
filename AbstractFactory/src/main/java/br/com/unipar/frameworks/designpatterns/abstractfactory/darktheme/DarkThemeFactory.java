package br.com.unipar.frameworks.designpatterns.abstractfactory.darktheme;

import br.com.unipar.frameworks.designpatterns.abstractfactory.Button;
import br.com.unipar.frameworks.designpatterns.abstractfactory.TextBox;
import br.com.unipar.frameworks.designpatterns.abstractfactory.WidgetFactory;


public class DarkThemeFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public TextBox createTextBox() {
        return new DarkThemeTextBox();
    }
    
}
