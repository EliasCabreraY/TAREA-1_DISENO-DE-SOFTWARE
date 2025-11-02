
package com.envivotickets.ports;

import com.envivotickets.domain.notificaciones.Notificacion;

public interface NotificacionService {
    boolean enviar(Notificacion n);
}
