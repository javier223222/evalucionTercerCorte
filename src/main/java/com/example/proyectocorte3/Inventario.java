package com.example.proyectocorte3;

import java.util.*;
import java.util.stream.Collectors;

public class Inventario {

   
    private static HashMap<String,UtilesEscoleres>utilesEscolares=new HashMap<String,UtilesEscoleres>();

    public static void ordenarBurbuja(){
      Map<String,UtilesEscoleres>resultado=utilesEscolares.entrySet()
              .stream()
              .sorted(Map.Entry.comparingByValue())
              .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (viejo,nuevo)->viejo,LinkedHashMap::new));

             utilesEscolares= (HashMap<String, UtilesEscoleres>) resultado;

    }

    public static void main(String[] args) {
        utilesEscolares.put("fdddd",new UtilesEscoleres("pepe",12));
        utilesEscolares.put("aaaa",new UtilesEscoleres("angel",55));
          ordenarBurbuja();

        System.out.println(utilesEscolares.toString());
    }

    public static void agregarProducto(UtilesEscoleres utilesEscoleres2) {
        utilesEscolares.put(utilesEscoleres2.getNombre(), utilesEscoleres2);
    }

    public HashMap<String, UtilesEscoleres> getUtilesEscolares() {
        return utilesEscolares;
    }

    public void setUtilesEscolares(HashMap<String, UtilesEscoleres> utilesEscolares) {
        Inventario.utilesEscolares = utilesEscolares;
    }
}