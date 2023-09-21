package br.com.unipar.frameworks.designpatterns.abstractfactory.lighttheme;

import br.com.unipar.frameworks.designpatterns.abstractfactory.Button;


public class LightThemeButton implements Button {

    @Override
    public void render() {
        System.out.println("LightTheme Button!");
    }
    
}
