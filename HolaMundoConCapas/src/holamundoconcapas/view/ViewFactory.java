/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

/**
 *
 * @author Andoni Fiat
 */
public class ViewFactory {
    /**
     * Metodo que llama crea un objeto
     * @return  devuelve un objeto tipo JavaFxViewImplementation
     */
    public View getView(){

        return new JavaFxViewImplementation();
    }
}
