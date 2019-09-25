/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

/**
 *
 * @author Andoni Fiat
 */

    
public class ModelImplementation implements Model{
    
    /**
     * Metodo que asigna un valor a 
     * la variable greeting
     * @return devuelve un mensaje
     */
    @Override
    public String getGreeting(){
    String greeting="Hola mundo con capas";
    return greeting;
    
    }
}
