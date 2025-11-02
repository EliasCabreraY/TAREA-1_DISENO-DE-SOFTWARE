
package com.envivotickets.domain.usuarios;

import java.util.UUID;

public class Administrador extends Usuario {
    private String permisos;

    public Administrador(UUID id, String nombre, String email, String permisos) {
        super(id, nombre, email);
        this.permisos = permisos;
    }

    public String getPermisos() { return permisos; }
    public void setPermisos(String permisos) { this.permisos = permisos; }
}
