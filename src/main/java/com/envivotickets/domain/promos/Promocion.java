
package com.envivotickets.domain.promos;

import com.envivotickets.common.Money;
import com.envivotickets.common.RangoFecha;

import java.util.List;

public class Promocion {
    private String id;
    private String nombre;
    private RangoFecha vigencia;

    public Promocion(String id, String nombre, RangoFecha vigencia) {
        this.id = id;
        this.nombre = nombre;
        this.vigencia = vigencia;
    }

    public boolean aplica(List<?> items){ return true; }
    public Money calcularDescuento(List<?> items){ return Money.of(0, "USD"); }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public RangoFecha getVigencia() { return vigencia; }
}
