/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lander Lluvia
 */
public class JavaFXViewImplementation extends Application implements View{

    private static String greeting;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //Carga el archivo fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        
        //Define la estructura de padres e hijos
        Parent root = loader.load();
        JavaFXDocumentController dc = loader.getController();
        dc.setGreeting(greeting);
        
        //Crea la escena
        Scene scene = new Scene(root);
        
        //Set la escena en el stage y lo muestra
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void showGreeting(String greeting) {
        JavaFXViewImplementation.greeting = greeting;
        launch();
    }
    
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }


    
}
