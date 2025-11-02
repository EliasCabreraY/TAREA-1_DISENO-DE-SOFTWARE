
package com.envivotickets.domain.reservas;

import com.envivotickets.common.Money;
import com.envivotickets.domain.eventos.Asiento;
import com.envivotickets.domain.eventos.Funcion;

public class LineaReserva {
    private Funcion funcion;
    private Asiento asiento;
    private Money precioUnitario;
    private String estadoRetencion;

    public LineaReserva(Funcion funcion, Asiento asiento, Money precioUnitario, String estadoRetencion) {
        this.funcion = funcion;
        this.asiento = asiento;
        this.precioUnitario = precioUnitario;
        this.estadoRetencion = estadoRetencion;
    }

    public Funcion getFuncion() { return funcion; }
    public Asiento getAsiento() { return asiento; }
    public Money getPrecioUnitario() { return precioUnitario; }
    public String getEstadoRetencion() { return estadoRetencion; }
}
