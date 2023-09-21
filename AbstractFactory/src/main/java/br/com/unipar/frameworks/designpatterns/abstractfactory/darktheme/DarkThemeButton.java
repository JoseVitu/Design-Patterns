package br.com.unipar.frameworks.designpatterns.abstractfactory.darktheme;

import br.com.unipar.frameworks.designpatterns.abstractfactory.Button;


public class DarkThemeButton implements Button {

    @Override
    public void render() {
        System.out.println("DarkTheme Button!");
    }
    
}
