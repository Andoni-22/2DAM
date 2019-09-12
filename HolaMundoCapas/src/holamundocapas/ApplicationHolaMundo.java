/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas;

import View.ViewFactory;
import View.View;
import Model.ModelFactory;
import Model.Model;

/**
 * Esta es la clase Application para el Hola mundo con capas
 * @author Lander Lluvia
 */
public class ApplicationHolaMundo {
    
    public static void main(String[] args) {
        
        ViewFactory vf = new ViewFactory();
        View v = vf.getView();
        
        ModelFactory mf = new ModelFactory();
        Model m = mf.getModel();
        
        Controller c = new Controller();
        c.run(v, m); 
        
        
    }
    
}
