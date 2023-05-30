module com.example.java_text_editior {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.java_text_editior to javafx.fxml;
    exports com.example.java_text_editior;
}