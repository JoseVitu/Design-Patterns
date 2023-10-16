
package br.com.designpatternexfixacao.comecoZero;

import br.com.designpatternexfixacao.abstrasctFactory.Button;
import br.com.designpatternexfixacao.abstrasctFactory.TextBox;
import br.com.designpatternexfixacao.abstrasctFactory.WidgetFactory;

public class comecoZeroFactory implements WidgetFactory {

    @Override
    public Button createButton() {
       return new comecoZeroButton();
    }

    @Override
    public TextBox createTextBox() {
       return new comecoZeroTextBox();
    }
    
}
