/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import javafx.stage.Stage;
import org.junit.Test;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;

import static org.testfx.matcher.control.LabeledMatchers.hasText;






/**
 *
 * @author Andoni Fiat
 */
public class FXMLDocumentControllerIT extends ApplicationTest{
   private final String GREETING="HOLA MUNDO";

    /**
     * metodo de prueba que lanza una ventana
     * @param stage parametro de tipo escena
     * @throws Exception 
     */
   @Override
   public void start(Stage stage) throws Exception{
       JavaFxViewImplementation myapp =
               new JavaFxViewImplementation();
       myapp.setGreeting(GREETING);
       myapp.start(stage);
   }
   
    @Test
    /**
     * Instrucciones que se le da al robot de pruebas
     */
    public void testLabelHasGreeting(){
        verifyThat("#label",hasText(GREETING));    
        //clickOn("#boton");       
    } 
}
