
package com.envivotickets.domain.pagos;

import com.envivotickets.common.Enums.EstadoPago;
import com.envivotickets.common.Money;

import java.time.LocalDateTime;
import java.util.UUID;

public class Pago {
    private UUID id;
    private Money monto;
    private EstadoPago estado;
    private LocalDateTime fecha;
    private String metodo;
    private Transaccion transaccion;

    public Pago(UUID id, Money monto, EstadoPago estado, LocalDateTime fecha, String metodo, Transaccion transaccion) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.monto = monto;
        this.estado = estado;
        this.fecha = fecha;
        this.metodo = metodo;
        this.transaccion = transaccion;
    }

    public UUID getId() { return id; }
    public Money getMonto() { return monto; }
    public EstadoPago getEstado() { return estado; }
    public LocalDateTime getFecha() { return fecha; }
    public String getMetodo() { return metodo; }
    public Transaccion getTransaccion() { return transaccion; }

    public void setEstado(EstadoPago estado) { this.estado = estado; }
    public void setTransaccion(Transaccion t) { this.transaccion = t; }
}
