package br.com.unipar.frameworks.designpatterns.abstractfactory.app;

import br.com.unipar.frameworks.designpatterns.abstractfactory.WidgetFactory;

public class ContactForm {
    
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
        
//        if(theme.equals(ThemeEnum.DARK_THEME)) {
//            new DarkThemeButton().render();
//            new LightThemeButton().render();
//        } else if (theme.equals(ThemeEnum.LIGHT_THEME)) {
//            new LightThemeButton().render();
//            new LightThemeTextBox().render();
//        }
    }
}
