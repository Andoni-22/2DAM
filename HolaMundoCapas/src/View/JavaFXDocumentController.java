/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.View;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Lander Lluvia
 */
public class JavaFXDocumentController {
    
    @FXML
    private Label label;
    private  String greeting;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText(greeting);
    }
    
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }
       

   
}
