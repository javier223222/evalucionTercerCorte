package com.example.proyectocorte3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.*;

public class HelloController {
    @FXML
    private Label welcomeText;
   
    private static HashMap<String,UtilesEscoleres>utilesEscolares=new HashMap<String,UtilesEscoleres>();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }



    public static void ordenarBurbuja(){

        List<UtilesEscoleres>util=new ArrayList<>(utilesEscolares.values());
        Collections.sort(util);
    }

}