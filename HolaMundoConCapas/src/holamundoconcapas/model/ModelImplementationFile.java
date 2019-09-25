/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

import java.util.ResourceBundle;


/**
 *
 * @author Andoni Fiat
 */
public class ModelImplementationFile implements Model {
     /**
   * Metodo que lee el texto que contiene un fichero de tipo propertie
   * @return Devuelve el valor del texto dentro del fichero 
   */
    @Override
    public String getGreeting() {

        return 
         ResourceBundle.getBundle("holamundoconcapas.model.archivo")
           .getString("greeting");
        
    }
    
}
