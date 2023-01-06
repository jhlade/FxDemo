module cz.joutsen.demo {
    requires javafx.controls;
    requires javafx.fxml;

    opens cz.joutsen.demo to javafx.graphics;
    exports cz.joutsen.demo;
}