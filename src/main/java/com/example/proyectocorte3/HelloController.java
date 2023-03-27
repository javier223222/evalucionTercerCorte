package com.example.proyectocorte3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText;
   
    private static HashMap<String,UtilesEscoleres>utilesEscolares=new HashMap<String,UtilesEscoleres>();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public String generarId(){
        String codigo="";
        int num=0;
        Random random=new Random();
        for (int i = 0; i < 4; i++) {
            num+=random.nextInt(0,200);
        }
        codigo+=String.valueOf(num);
        if (utilesEscolares.containsKey(codigo)){
            codigo=generarId();
        }
        return codigo;

    }

}