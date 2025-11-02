
package com.envivotickets.domain.reservas;

import com.envivotickets.common.Enums.EstadoTicket;
import com.envivotickets.common.Money;
import com.envivotickets.domain.eventos.Asiento;
import com.envivotickets.domain.eventos.Funcion;

import java.util.UUID;

public class Ticket {
    private UUID id;
    private String codigoQR;
    private EstadoTicket estado;
    private Money precioFinal;
    private Funcion funcion;
    private Asiento asiento;

    public Ticket(UUID id, String codigoQR, EstadoTicket estado, Money precioFinal, Funcion funcion, Asiento asiento) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.codigoQR = codigoQR;
        this.estado = estado;
        this.precioFinal = precioFinal;
        this.funcion = funcion;
        this.asiento = asiento;
    }

    public UUID getId() { return id; }
    public String getCodigoQR() { return codigoQR; }
    public EstadoTicket getEstado() { return estado; }
    public Money getPrecioFinal() { return precioFinal; }
    public Funcion getFuncion() { return funcion; }
    public Asiento getAsiento() { return asiento; }

    public void setEstado(EstadoTicket estado) { this.estado = estado; }
}
