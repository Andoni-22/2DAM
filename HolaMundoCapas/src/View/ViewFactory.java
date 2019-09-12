/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.View;

/**
 *
 * @author Lander Lluvia
 */
public class ViewFactory {
    
    public static View getView(){
        return new JavaFXViewImplementation();
    }
}
