
package com.envivotickets.domain.eventos;

import com.envivotickets.common.SeatMap;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Funcion {
    private UUID id;
    private LocalDateTime fechaHora;
    private String estado;
    private int tiempoRetencionSeg;
    private Espacio espacio;
    private List<Seccion> secciones = new ArrayList<>();

    public Funcion(UUID id, LocalDateTime fechaHora, String estado, int tiempoRetencionSeg, Espacio espacio) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.fechaHora = fechaHora;
        this.estado = estado;
        this.tiempoRetencionSeg = tiempoRetencionSeg;
        this.espacio = espacio;
    }

    public UUID getId() { return id; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public String getEstado() { return estado; }
    public int getTiempoRetencionSeg() { return tiempoRetencionSeg; }
    public Espacio getEspacio() { return espacio; }
    public List<Seccion> getSecciones(){ return secciones; }
    public void agregarSeccion(Seccion s){ if(s!=null) secciones.add(s); }

    public SeatMap getDisponibilidad() {
        SeatMap map = new SeatMap();
        for (Seccion s : secciones) {
            for (Asiento a : s.getAsientos()) {
                map.setEstado(a.key(), "DISPONIBLE");
            }
        }
        return map;
    }
}
