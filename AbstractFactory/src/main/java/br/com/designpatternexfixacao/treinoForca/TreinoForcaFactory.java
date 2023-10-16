
package br.com.designpatternexfixacao.treinoForca;

import br.com.designpatternexfixacao.abstrasctFactory.Button;
import br.com.designpatternexfixacao.abstrasctFactory.TextBox;
import br.com.designpatternexfixacao.abstrasctFactory.WidgetFactory;


public class TreinoForcaFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new TreinoForcaButton();
    }

    @Override
    public TextBox createTextBox() {
       return new TreinoForcaTextBox();
    }
    
}
