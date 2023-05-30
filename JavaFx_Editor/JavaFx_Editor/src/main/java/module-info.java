module com.example.javafx_editor {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.javafx_editor to javafx.fxml;
    exports com.example.javafx_editor;
}