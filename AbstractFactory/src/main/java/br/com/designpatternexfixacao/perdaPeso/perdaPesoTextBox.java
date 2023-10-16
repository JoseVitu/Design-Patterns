
package br.com.designpatternexfixacao.perdaPeso;

import br.com.designpatternexfixacao.abstrasctFactory.TextBox;

public class perdaPesoTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("PERDA DE PESO TEXTBOX");
    }
    
}
