package com.envivotickets.ports;

import com.envivotickets.common.SeatMap;
import com.envivotickets.domain.eventos.Funcion;

public interface SeatMapProvider {
    SeatMap mapaInteractivo(Funcion funcion);
}