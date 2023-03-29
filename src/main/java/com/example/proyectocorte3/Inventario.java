package com.example.proyectocorte3;

import java.util.*;

public class Inventario {

   
    private static HashMap<String,UtilesEscoleres>utilesEscolares=new HashMap<String,UtilesEscoleres>();

    public void ordenarBurbuja(){
        List<UtilesEscoleres>util=new ArrayList<>(utilesEscolares.values());
        Collections.sort(util);
    }
<<<<<<< HEAD
    public static void agregarProducto(UtilesEscoleres utilesEscoleres2){
        utilesEscolares.put(utilesEscoleres2.getNombre(),utilesEscoleres2);
=======
    public void agrgearProducti(UtilesEscoleres utilesEscoleres2){
        utilesEscolares.put(utilesEscoleres2.getNombre().toLowerCase(),utilesEscoleres2);
>>>>>>> 2483497d56908f80af0763e4e31a92ee0492ef44
    }

    public  HashMap<String, UtilesEscoleres> getUtilesEscolares() {
        return utilesEscolares;
    }

    public void setUtilesEscolares(HashMap<String, UtilesEscoleres> utilesEscolares) {
        Inventario.utilesEscolares = utilesEscolares;
    }
}