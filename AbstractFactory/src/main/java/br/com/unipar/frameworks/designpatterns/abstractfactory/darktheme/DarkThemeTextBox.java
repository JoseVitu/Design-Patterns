package br.com.unipar.frameworks.designpatterns.abstractfactory.darktheme;

import br.com.unipar.frameworks.designpatterns.abstractfactory.TextBox;


public class DarkThemeTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("DarkTheme TextBox!");
    }
    
}
