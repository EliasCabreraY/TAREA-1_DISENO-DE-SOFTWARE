
package com.envivotickets.ports;

import com.envivotickets.common.Money;
import com.envivotickets.domain.reservas.LineaReserva;

import java.util.List;

public interface PricingStrategy {
    Money calcularSubtotal(List<LineaReserva> items);
}