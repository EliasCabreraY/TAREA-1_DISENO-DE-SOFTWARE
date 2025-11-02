
package com.envivotickets.servicios;

import com.envivotickets.common.Enums.EstadoPago;
import com.envivotickets.common.Money;
import com.envivotickets.domain.pagos.Pago;
import com.envivotickets.domain.pagos.Transaccion;
import com.envivotickets.ports.PaymentGateway;

import java.time.LocalDateTime;

public class PagoService {
    private final PaymentGateway gateway;

    public PagoService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public Pago pagar(Money total, String metodo) {
        Pago pago = new Pago(null, total, EstadoPago.PENDIENTE, LocalDateTime.now(), metodo, null);
        Transaccion tx = gateway.autorizar(pago);
        if (tx != null && gateway.capturar(tx)) {
            pago.setEstado(EstadoPago.CAPTURADO);
            pago.setTransaccion(tx);
        } else {
            pago.setEstado(EstadoPago.FALLIDO);
        }
        return pago;
    }
}
