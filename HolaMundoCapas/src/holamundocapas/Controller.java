/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundocapas;

import View.View;
import Model.Model;

/**
 *
 * @author Lander Lluvia
 */
public class Controller {
    public void run(View v, Model m){
        String greeting = m.getGreeting();
        v.showGreeting(greeting);
        
    }
        
    
}
