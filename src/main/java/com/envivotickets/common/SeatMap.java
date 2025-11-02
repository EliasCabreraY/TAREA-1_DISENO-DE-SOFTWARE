
package com.envivotickets.common;

import java.util.Map;
import java.util.HashMap;

public class SeatMap {
    private final Map<String, String> estadosPorAsiento = new HashMap<>();
    // clave "FILA-NUM", valor "DISPONIBLE/RETENIDO/RESERVADO/AGOTADO"
    public void setEstado(String key, String estado) { estadosPorAsiento.put(key, estado); }
    public String getEstado(String key) { return estadosPorAsiento.get(key); }
    public Map<String,String> asMap(){ return estadosPorAsiento; }
}
