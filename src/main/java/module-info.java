module com.example.proyectocorte3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectocorte3 to javafx.fxml;
    exports com.example.proyectocorte3;
}