
package com.envivotickets;

import com.envivotickets.common.Money;
import com.envivotickets.domain.eventos.*;
import com.envivotickets.domain.reservas.LineaReserva;
import com.envivotickets.ports.PaymentGateway;
import com.envivotickets.ports.PricingStrategy;
import com.envivotickets.services.PagoService;
import com.envivotickets.services.PrecioService;
import com.envivotickets.services.ReservaService;

import java.time.LocalDateTime;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        // Setup mínimo para compilar/ejecutar
        PricingStrategy pricing = items -> items.stream()
                .map(LineaReserva::getPrecioUnitario)
                .reduce(Money.of(0, "USD"), Money::add);
        PrecioService precioService = new PrecioService(pricing);

        PaymentGateway gateway = new PaymentGateway() {
            public com.envivotickets.domain.pagos.Transaccion autorizar(com.envivotickets.domain.pagos.Pago pago) {
                return new com.envivotickets.domain.pagos.Transaccion("AUTH123", "{ok:true}");
            }
            public boolean capturar(com.envivotickets.domain.pagos.Transaccion tx) { return true; }
            public boolean reembolsar(com.envivotickets.domain.pagos.Pago pago) { return true; }
        };
        PagoService pagoService = new PagoService(gateway);

        ReservaService reservaService = new ReservaService(precioService, pagoService, notificacion -> true);

        Espacio espacio = new Espacio("Teatro Central","Av. Principal 123");
        Funcion funcion = new Funcion(null, LocalDateTime.now().plusDays(3),"PROGRAMADA", 600, espacio);
        Seccion platea = new Seccion("Platea", 100, "Alta");
        platea.agregarAsiento(new Asiento("A",1,false));
        platea.agregarAsiento(new Asiento("A",2,false));
        funcion.agregarSeccion(platea);

        var l1 = new LineaReserva(funcion, platea.getAsientos().get(0), Money.of(25, "USD"), "RETENIDO");
        var l2 = new LineaReserva(funcion, platea.getAsientos().get(1), Money.of(25, "USD"), "RETENIDO");
        var carrito = reservaService.retenerAsientos(funcion, platea.getAsientos(), List.of(l1, l2));
        reservaService.confirmarCompra(carrito, "TARJETA");
        System.out.println("Prototipo EnVivoTickets OK");
    }
}
