/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crmsys;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
// chạy lại coi thử đi, vào configer chổ nào, chổ mà t, configer là gì z ;;-;;
/**
 *
 * @author Mun Chan
 */
public class CrmSys extends Application {
   
    static Stage stage = null;
   
    
    @Override
   public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
//        URL url = getClass().getClassLoader().getResource("Login.fxml");
//        FXMLLoader loader = new FXMLLoader(url);
        Scene scene = new Scene(root);
        

        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        CrmSys.stage = stage;
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
