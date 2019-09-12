package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import View.View;

/**
 * A view implementation 
 * @author Lander LLuvia
 */
public class ViewImplementation implements View{
    /**
     * Show a greeting
     * @param greeting A String containing a greeting. 
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
    
}
