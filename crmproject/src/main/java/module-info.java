module com.quyen.crmproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;
    requires javafx.graphics;
    requires com.jfoenix;
    requires fontawesomefx;
    opens com.quyen.crmproject to javafx.fxml;
    exports com.quyen.crmproject;
}
