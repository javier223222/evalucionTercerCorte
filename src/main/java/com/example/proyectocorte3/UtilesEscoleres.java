package com.example.proyectocorte3;

import java.util.Objects;

public class UtilesEscoleres implements Comparable<UtilesEscoleres> {
    private String nombre;
    private int cantidadAcomprar;
    private int cantidadComprada;

    public UtilesEscoleres(String nombre, int cantidadAcomprar) {
        this.nombre = nombre;
        this.cantidadAcomprar = cantidadAcomprar;
    }
    public UtilesEscoleres(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadAcomprar() {
        return cantidadAcomprar;
    }

    public void setCantidadAcomprar(int cantidadAcomprar) {
        this.cantidadAcomprar = cantidadAcomprar;
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                 "Cantidad comprada"+(cantidadAcomprar-cantidadComprada);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UtilesEscoleres that = (UtilesEscoleres) o;
        return nombre.equals(that.nombre);
    }

    public int obtenerDiferencia(){
        return cantidadAcomprar-cantidadComprada;
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public int compareTo(UtilesEscoleres o) {
        return this.nombre.compareTo(o.nombre);
    }
}
