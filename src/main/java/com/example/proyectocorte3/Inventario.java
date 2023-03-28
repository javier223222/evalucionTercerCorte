package com.example.proyectocorte3;

import java.util.*;

public class Inventario {

   
    private static HashMap<String,UtilesEscoleres>utilesEscolares=new HashMap<String,UtilesEscoleres>();



    public void ordenarBurbuja(){
        List<UtilesEscoleres>util=new ArrayList<>(utilesEscolares.values());
        Collections.sort(util);
    }
    public void agrgearProducti(UtilesEscoleres utilesEscoleres2){
        utilesEscolares.put(utilesEscoleres2.getNombre(),utilesEscoleres2);
    }

    public  HashMap<String, UtilesEscoleres> getUtilesEscolares() {
        return utilesEscolares;
    }

    public void setUtilesEscolares(HashMap<String, UtilesEscoleres> utilesEscolares) {
        Inventario.utilesEscolares = utilesEscolares;
    }
}