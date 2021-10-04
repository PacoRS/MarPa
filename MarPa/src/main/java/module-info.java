module com.MarPa.MarPa {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.MarPa.MarPa to javafx.fxml;
    exports com.MarPa.MarPa;
}
