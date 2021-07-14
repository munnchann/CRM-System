/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproject1;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class LoginController implements Initializable {
    

    @FXML
    private Pane content_area;
    
    @FXML
    private TextField txtUsername;
    
    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnSignin;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    


    @FXML
    private void open_registration(MouseEvent event) throws IOException {
     Parent fxml = FXMLLoader.load(getClass().getResource("registrationUI.fxml"));
     content_area.getChildren().removeAll();
     content_area.getChildren().setAll(fxml);

        }
//    void open_registration(MouseEvent event, FXMLLoader loader){
//        try{
//            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//            loader = new FXMLLoader();
//            loader.setLocation(getClass().getResource("registrationUI.fxml"));
//            
//            parent = loader.load();
//            
//            Scene scene = new Scene(parent);
//            stage.setScene(scene);
//            
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }

    @FXML
    private void close_app(MouseEvent event) {
        System.exit(0);
    }
}
    
   
        
    
