module com.example.java_fx_projekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_fx_projekt to javafx.fxml;
    exports com.example.java_fx_projekt;
}