module com.example.javafx_einfuerung {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafx_einfuerung to javafx.fxml;
    exports com.example.javafx_einfuerung;
}