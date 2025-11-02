
package com.envivotickets.domain.usuarios;

import java.util.UUID;

public abstract class Usuario {
    protected UUID id;
    protected String nombre;
    protected String email;

    protected Usuario(UUID id, String nombre, String email) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
        this.email = email;
    }

    public UUID getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}
