package com.example.proyectocorte3;

import java.util.*;
import java.util.stream.Collectors;

public class Inventario {
    private static HashMap<String,UtilesEscoleres>utilesEscolares=new HashMap<String,UtilesEscoleres>();

    public  void ordenarBurbuja(){
      Map<String,UtilesEscoleres>resultado=utilesEscolares.entrySet()
              .stream()
              .sorted(Map.Entry.comparingByValue())
              .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (viejo,nuevo)->viejo,LinkedHashMap::new));

             utilesEscolares = (HashMap<String, UtilesEscoleres>) resultado;
    }



    public  void agregarProducto(UtilesEscoleres utilesEscoleres2) {
        utilesEscolares.put(utilesEscoleres2.getNombre(), utilesEscoleres2);
    }

    public HashMap<String, UtilesEscoleres> getUtilesEscolares() {
        return utilesEscolares;
    }

    public void setUtilesEscolares(HashMap<String, UtilesEscoleres> utilesEscolares) {
        Inventario.utilesEscolares = utilesEscolares;
    }
}