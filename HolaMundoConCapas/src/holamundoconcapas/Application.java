/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;

import holamundoconcapas.controler.Controler;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.view.ViewFactory;
import java.util.logging.Logger;

/**
 *
 * @author Andoni Fiat
 */
public class Application { 
    private static final Logger LOGGER 
        = Logger.getLogger("holamundoconcapas.Application") ;
  
    
    /**
     * Es el main de la aplicacion, se encarga de llamar
     * al controlador para que ejecute el metodo run
     * @param args
     */
    public static void main(String [] args){
        LOGGER.info("Start of main");
        ViewFactory viewF = new ViewFactory();
        ModelFactory modelF = new ModelFactory();
        
        Controler controler = new Controler();
        
        controler.run( viewF.getView(), modelF.getGreeting());
        LOGGER.info("End of main");
    }

}
