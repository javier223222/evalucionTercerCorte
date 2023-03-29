package com.example.proyectocorte3;

public class ControladorTabla {
    private String nombre;
    private int cantComprada;
    private int cantNecesaria;
    private int cantPendiente;

    public ControladorTabla(String nombre, int cantComprada, int cantNecesaria, int cantPendiente) {
        this.nombre = nombre;
        this.cantComprada = cantComprada;
        this.cantNecesaria = cantNecesaria;
        this.cantPendiente = cantPendiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantComprada() {
        return cantComprada;
    }

    public void setCantComprada(int cantComprada) {
        this.cantComprada = cantComprada;
    }

    public int getCantNecesaria() {
        return cantNecesaria;
    }

    public void setCantNecesaria(int cantNecesaria) {
        this.cantNecesaria = cantNecesaria;
    }

    public int getCantPendiente() {
        return cantPendiente;
    }

    public void setCantPendiente(int cantPendiente) {
        this.cantPendiente = cantPendiente;
    }
}
