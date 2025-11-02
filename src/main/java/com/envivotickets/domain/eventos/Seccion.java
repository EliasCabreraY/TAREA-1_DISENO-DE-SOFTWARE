
package com.envivotickets.domain.eventos;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
    private String nombre;
    private int capacidad;
    private String visibilidad;
    private List<Asiento> asientos = new ArrayList<>();

    public Seccion(String nombre, int capacidad, String visibilidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.visibilidad = visibilidad;
    }

    public String getNombre() { return nombre; }
    public int getCapacidad() { return capacidad; }
    public String getVisibilidad() { return visibilidad; }
    public List<Asiento> getAsientos() { return asientos; }

    public void agregarAsiento(Asiento a){ if(a!=null) asientos.add(a); }
}
