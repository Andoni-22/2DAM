/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;

/**
 *
 * @author Andoni Fiat
 */
public class ViewImplementation implements View{
    private static final Logger LOGGER 
        = Logger.getLogger("holamundoconcapas.view.ViewImplementation") ;

    /**
     *Este metodo muestra un mensaje
     * @param greeting String que contiene un mensaje
     */
    @Override
    public void showGreeting(String greeting){
        LOGGER.info("Mandando mensaje");
        System.out.println(greeting);
        LOGGER.info("mensaje enviado");
    }
}
