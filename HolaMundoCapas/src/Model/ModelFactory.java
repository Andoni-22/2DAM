/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.ModelImplementation;
import Model.Model;

/**
 *
 * @author Lander Lluvia
 */
public class ModelFactory {
    public static Model getModel(){
        return new ModelImplementation();
    }
}
