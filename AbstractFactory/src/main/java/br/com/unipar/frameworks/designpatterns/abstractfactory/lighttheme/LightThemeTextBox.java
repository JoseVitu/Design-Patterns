package br.com.unipar.frameworks.designpatterns.abstractfactory.lighttheme;

import br.com.unipar.frameworks.designpatterns.abstractfactory.TextBox;


public class LightThemeTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("LightTheme TextBox!");
    }
    
}
