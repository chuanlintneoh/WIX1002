module com.example.l1q4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.l1q4 to javafx.fxml;
    exports com.example.l1q4;
}