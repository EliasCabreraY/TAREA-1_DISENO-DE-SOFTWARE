
package com.envivotickets.domain.usuarios;

import java.util.UUID;

public class AgenteSoporte extends Usuario {
    private int nivel;

    public AgenteSoporte(UUID id, String nombre, String email, int nivel) {
        super(id, nombre, email);
        this.nivel = nivel;
    }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
}
