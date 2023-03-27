package com.example.proyectocorte3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.HashSet;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private static HashMap<String,UtilesEscoleres>utilesEscolares=new HashMap<String,UtilesEscoleres>();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}