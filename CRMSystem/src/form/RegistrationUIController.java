
package demoproject1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class RegistrationUIController implements Initializable {

    @FXML
    private AnchorPane pane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void close_app(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    private void Back_to_menu(MouseEvent event, Parent root) {
        SigninFX.stage.getScene().setRoot(root);
    }
    
}
