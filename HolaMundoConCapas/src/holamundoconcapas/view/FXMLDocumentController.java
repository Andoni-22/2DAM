/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Andoni Fiat
 */
public class FXMLDocumentController {
    private static final Logger LOGGER 
        = Logger.getLogger("holamundoconcapas.view.FXMLDocumentController") ;
 
    @FXML
    private Label label;
    /**
     * etiqueta de texto de la ventana
     */
    
    private Button boton;
    /**
     * Boton de la ventana
     */
    private String greeting;
    private Stage stage;
    /**
     * Asigna valor a greeting
     * @param greeting contiene un mensaje
     */
    public void setGreeting(String greeting){
        this.greeting=greeting;
    }
    /**
     * Inicializa una escena
     */
    public void initStage(){
        LOGGER.info("loading the scene");
       stage.setOnShowing(this::onWindowShowing);
       LOGGER.info("scene loading finished");
    }
    /**
     * Este metodo hace que el textlabel de la pantalla
     * java FX muestre un mensaje
     * @param e 
     */
    public void onWindowShowing(WindowEvent e){
        LOGGER.info("geting value to label");
        label.setText(greeting);    
    }
   @FXML
   /**
    * Metodo que cierra la ventana javaFX
    * al pulsar el botno
    */
    private void cerrarVentana(ActionEvent event){
        Platform.exit();
        LOGGER.info("window closed");
    }
    
    void setStage(Stage stage){
        this.stage=stage;
    }
    
}
