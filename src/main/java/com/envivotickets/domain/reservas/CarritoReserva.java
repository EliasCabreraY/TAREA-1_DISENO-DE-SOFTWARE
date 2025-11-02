
package com.envivotickets.domain.reservas;

import com.envivotickets.common.Money;
import com.envivotickets.domain.eventos.Asiento;
import com.envivotickets.domain.eventos.Funcion;
import com.envivotickets.domain.pagos.Pago;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CarritoReserva {
    private UUID id;
    private LocalDateTime expiracion;
    private List<LineaReserva> lineas = new ArrayList<>();

    public CarritoReserva(UUID id, LocalDateTime expiracion) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.expiracion = expiracion;
    }

    public UUID getId() { return id; }
    public LocalDateTime getExpiracion() { return expiracion; }
    public List<LineaReserva> getLineas() { return lineas; }

    public void agregarAsiento(Funcion f, Asiento a, Money precioUnitario) {
        lineas.add(new LineaReserva(f, a, precioUnitario, "RETENIDO"));
    }

    public Pago confirmar(Money total) {
        // En el prototipo solo retornamos null, Pago lo hará PagoService
        return null;
    }
}
