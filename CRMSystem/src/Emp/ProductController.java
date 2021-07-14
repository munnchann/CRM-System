/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.product;

/**
 * FXML Controller class
 *
 * @author Mun Chan
 */
public class ProductController implements Initializable {

    @FXML
    private Button btnnew;
    @FXML
    private Button btnupdate;
    @FXML
    private TextField txtid;
    @FXML
    private TextField txtcode;
    @FXML
    private TextField txtname;
    @FXML
    private TextField txtprice;
    @FXML
    private TextField txtdes;
    @FXML
    private TextField txtamount;
    @FXML
    private TextField txtcate;
    @FXML
    private Button btnadd;
    @FXML
    private Button btndelete;
    @FXML
    private TableView<product> tblproduct;
    @FXML
    private TableColumn<product, Integer> colid;
    @FXML
    private TableColumn<product, String> colcode;
    @FXML
    private TableColumn<product, String> colname;
    @FXML
    private TableColumn<product, Double> coleprice;
    @FXML
    private TableColumn<product, String> coldes;
    @FXML
    private TableColumn<product, Integer> colamount;
    @FXML
    private TableColumn<product, Integer> colcate;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
}
