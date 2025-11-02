
package com.envivotickets.domain.promos;

import com.envivotickets.common.Money;

public class PaqueteAdicional {
    private String id;
    private String tipo;
    private Money precio;

    public PaqueteAdicional(String id, String tipo, Money precio) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getId() { return id; }
    public String getTipo() { return tipo; }
    public Money getPrecio() { return precio; }
}
