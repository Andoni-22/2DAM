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
public class ModelFactory {
    /**
     * Metodo que llama al metodo getGreeting
     * de la clase ModelImplementationFile
     * @return le devuelve un objeto de tipo ModelImplementationFile
     */
    public ModelImplementationFile getGreeting(){
    
        return new ModelImplementationFile();
    }
}
