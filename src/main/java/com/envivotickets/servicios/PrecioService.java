
package com.envivotickets.services;

import com.envivotickets.common.Money;
import com.envivotickets.domain.reservas.LineaReserva;
import com.envivotickets.ports.PricingStrategy;

import java.util.List;

public class PrecioService {
    private final PricingStrategy strategy;

    public PrecioService(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public Money cotizar(List<LineaReserva> items) {
        return strategy.calcularSubtotal(items);
    }
}
