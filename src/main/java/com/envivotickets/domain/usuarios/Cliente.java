
package com.envivotickets.domain.usuarios;

import java.util.UUID;

public class Cliente extends Usuario {
    private String medioContactoPreferido;

    public Cliente(UUID id, String nombre, String email, String medioContactoPreferido) {
        super(id, nombre, email);
        this.medioContactoPreferido = medioContactoPreferido;
    }

    public String getMedioContactoPreferido() { return medioContactoPreferido; }
    public void setMedioContactoPreferido(String m) { this.medioContactoPreferido = m; }
}
