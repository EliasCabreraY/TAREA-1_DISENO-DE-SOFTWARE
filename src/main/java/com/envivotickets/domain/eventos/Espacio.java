
package com.envivotickets.domain.eventos;

public class Espacio {
    private String nombre;
    private String direccion;

    public Espacio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
}
