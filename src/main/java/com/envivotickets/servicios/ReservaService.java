
package com.envivotickets.servicios;

import com.envivotickets.common.Money;
import com.envivotickets.domain.eventos.Asiento;
import com.envivotickets.domain.eventos.Funcion;
import com.envivotickets.domain.reservas.CarritoReserva;
import com.envivotickets.domain.reservas.LineaReserva;
import com.envivotickets.ports.NotificacionService;

import java.time.LocalDateTime;
import java.util.List;

public class ReservaService {
  private final PrecioService precioService;
  private final PagoService pagoService;
  private final NotificacionService notificacionService;

  public ReservaService(PrecioService precioService, PagoService pagoService, NotificacionService notificacionService) {
    this.precioService = precioService;
    this.pagoService = pagoService;
    this.notificacionService = notificacionService;
  }

  public CarritoReserva retenerAsientos(Funcion funcion, List<Asiento> asientos, List<LineaReserva> lineas) {
    CarritoReserva carrito = new CarritoReserva(null, LocalDateTime.now().plusSeconds(funcion.getTiempoRetencionSeg()));
    for (LineaReserva l : lineas) {
      carrito.getLineas().add(l);
    }
    return carrito;
  }

  public void liberarVencidos(CarritoReserva carrito) {
    if (carrito.getExpiracion().isBefore(LocalDateTime.now())) {
      carrito.getLineas().clear();
    }
  }

  public void confirmarCompra(CarritoReserva carrito, String metodoPago) {
    Money total = precioService.cotizar(carrito.getLineas());
    var pago = pagoService.pagar(total, metodoPago);
    // En un sistema real, aquí notificaríamos al cliente y generaríamos tickets
  }
}
