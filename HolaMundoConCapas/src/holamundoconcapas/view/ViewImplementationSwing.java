/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Andoni Fiat
 */
public class ViewImplementationSwing implements View{
    private static final Logger LOGGER 
         = Logger.getLogger("holamundoconcapas.view.ViewImplementationSwing") ;
 
    /**
     * metodo que crea una pantalla con un mensaje
     * @param greeting contiene un mensaje
     */
    @Override
    public void showGreeting(String greeting) {
        LOGGER.info("loading JFRAME");
        JFrame frame = new JFrame ("Sample frame");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JOptionPane.showMessageDialog(frame,greeting);
        LOGGER.info("JFRAME loading finished");
    }
    
}
