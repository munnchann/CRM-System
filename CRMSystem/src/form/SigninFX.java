/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproject1;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author ASUS
 */
public class SigninFX extends Application {

    static Stage stage = null;
   
    
    @Override
   public void start(Stage stage) throws IOException, Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
//        URL url = getClass().getClassLoader().getResource("Login.fxml");
//        FXMLLoader loader = new FXMLLoader(url);
        Scene scene = new Scene(root);
        

        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        SigninFX.stage = stage;
        MetaData.parent = root;
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
