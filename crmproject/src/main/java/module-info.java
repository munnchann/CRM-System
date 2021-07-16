module com.quyen.crmproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    opens com.quyen.crmproject to javafx.fxml;
    exports com.quyen.crmproject;
}
