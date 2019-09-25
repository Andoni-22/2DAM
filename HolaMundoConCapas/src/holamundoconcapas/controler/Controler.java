/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controler;

import holamundoconcapas.model.Model;
import holamundoconcapas.view.View;
import java.util.logging.Logger;

/**
 *
 * @author Andoni Fiat
 */
public class Controler {
    private static final Logger LOGGER 
            = Logger.getLogger("holamundoconcapas.controler.Controler") ;
    /**
     * Este metodo ejecuta la logica de la aplicacion,
     * Consigue el mensaje de la clase model 
     * @param view Objeto view
     * @param model Objeto model
     */
    public void run(View view, Model model){
        try{
            LOGGER.info("Starting run method");
            view.showGreeting(model.getGreeting());
            LOGGER.info("Ending run method");
        }catch(Exception e){
            LOGGER.severe(e.getMessage());
        }
        

    }
}
