
package com.envivotickets.ports;

import com.envivotickets.domain.pagos.Pago;
import com.envivotickets.domain.pagos.Transaccion;

public interface PaymentGateway {
    Transaccion autorizar(Pago pago);

    boolean capturar(Transaccion tx);

    boolean reembolsar(Pago pago);
}
