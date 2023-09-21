package br.com.unipar.frameworks.designpatterns;

import br.com.unipar.frameworks.designpatterns.abstractfactory.WidgetFactory;
import br.com.unipar.frameworks.designpatterns.abstractfactory.app.ContactForm;
import br.com.unipar.frameworks.designpatterns.abstractfactory.lighttheme.LightThemeFactory;


public class DesignPatterns {

    public static void main(String[] args) {
       new ContactForm().render(new LightThemeFactory());
    }
}
