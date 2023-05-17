module com.example.jafafx_game {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jafafx_game to javafx.fxml;
    exports com.example.jafafx_game;
}