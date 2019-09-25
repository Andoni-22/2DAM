/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

import java.io.IOException;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Andoni Fiat
 */
public class JavaFxViewImplementation extends javafx.application.Application implements View{
   private static final Logger LOGGER 
            = Logger.getLogger("holamundoconcapas.view.JavaFxViewImplementation") ;
   
    String greeting = null;
    /**
     * Metodo que carga la ventana de javaFX
     * @param primaryStage parametro de tipo Stage
     * @throws Exception 
     */
     @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        try{
            //Carga el archivo fxml
            LOGGER.info("Cargando aplicacion JAVAFX");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana.fxml"));
        
        Parent root = (Parent)loader.load();
        
        FXMLDocumentController viewController = ((FXMLDocumentController)loader.getController());
        
        
        viewController.setGreeting(greeting);
        viewController.setStage(primaryStage);
        viewController.initStage();
        Scene scene = new Scene (root);
        
        primaryStage.setScene(scene);
//        primaryStage.setOnShowing(FXMLDocumentController::onWindowShowing);
        primaryStage.show();
        }catch(IOException e){
           // e.printStackTrace();
           LOGGER.severe(e.getMessage());
        } 
        LOGGER.info("Inicializacion de JAVAFX terminada");
    }
    
    
    /**
     * Metodo que lanca la ventana
     * @param greeting contiene un mensaje
     */
    @Override
    public void showGreeting(String greeting) {
        launch(greeting );
    }
    /**
     * Metodo que inicializa la aplicacion
     * @throws Exception 
     */
    @Override
    public void init() throws Exception{
        this.greeting=getParameters().getRaw().get(0);
    }
    /**
     * Asigna un valor a la variable greeting
     * @param greeting contiene un mensaje
     */
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }

   
    
}
