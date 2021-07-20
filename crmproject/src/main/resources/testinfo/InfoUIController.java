/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinfo;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.product;
import dao.productDao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FXML Controller class
 *
 * @author Mun Chan
 */
public class InfoUIController implements Initializable {

    @FXML
    private TextField txtid;
    @FXML
    private TextField txtname;
    @FXML
    private TextField txtamount;
    @FXML
    private TextField txtdis;
    @FXML
    private TextField txtcate;
    @FXML
    private TextField txtprice;
    @FXML
    private Button btnnew;
    @FXML
    private Button btndelete;
    @FXML
    private Button btnupdate;
    @FXML
    private Button btnadd;
    @FXML
    private TableView<product> tblpro;
    @FXML
    private TableColumn<product, Integer> tblid;
    @FXML
    private TableColumn<product, String> tblname;
    @FXML
    private TableColumn<product, Double> tblprice;
    @FXML
    private TableColumn<product, String> tbldis;
    @FXML
    private TableColumn<product, Integer> tblamount;
    @FXML
    private TableColumn<product, String> tblcate;
    
    ObservableList<product> listproduct;
    int index = -1;
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pstmt= null;
    Statement stmt = null;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tblid.setCellValueFactory(new PropertyValueFactory<product, Integer>("ID"));
        tblname.setCellValueFactory(new PropertyValueFactory<product, String>("NameProduct"));
        tblprice.setCellValueFactory(new PropertyValueFactory<product, Double>("Price"));
        tblamount.setCellValueFactory(new PropertyValueFactory<product, Integer>("Amount"));
        tbldis.setCellValueFactory(new PropertyValueFactory<product, String>("DescripProduct"));
        tblcate.setCellValueFactory(new PropertyValueFactory<product, String>("cate_pro"));    
        try {
            listproduct = (ObservableList<product>) productDao.GetInstance().findAll();
        } catch (Exception ex) {
            Logger.getLogger(InfoUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblpro.setItems(listproduct);
    }    
    
}
