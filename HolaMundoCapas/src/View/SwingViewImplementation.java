/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.View;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Class for the Swing implementation of the Holamundocapas
 * @author Lander Lluvia
 */
public class SwingViewImplementation implements View{
    /**
     * 
     * @param greeting 
     */
    @Override
    public void showGreeting(String greeting) {
        JFrame frame = new JFrame();
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, greeting, greeting, JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
    
}
