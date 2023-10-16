
package br.com.designpatternexfixacao.ganhoMassa;

import br.com.designpatternexfixacao.abstrasctFactory.Button;
import br.com.designpatternexfixacao.abstrasctFactory.TextBox;
import br.com.designpatternexfixacao.abstrasctFactory.WidgetFactory;


public class GanhoMassaFactory implements WidgetFactory {

    @Override
    public Button createButton() {
    return new GanhoMassaButton();
    }

    @Override
    public TextBox createTextBox() {
    return new GanhoMassaTextBox();
    }
    
}
