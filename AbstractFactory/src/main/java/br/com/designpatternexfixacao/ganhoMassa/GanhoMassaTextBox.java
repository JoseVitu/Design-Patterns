
package br.com.designpatternexfixacao.ganhoMassa;

import br.com.designpatternexfixacao.abstrasctFactory.TextBox;


public class GanhoMassaTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("GANHO MASSA TEXTBOX !!!");
    }
    
}
