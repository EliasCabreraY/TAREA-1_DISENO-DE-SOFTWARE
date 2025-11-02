
package com.envivotickets.domain.soporte;

import com.envivotickets.common.Enums.EstadoIncidente;

import java.time.LocalDateTime;

public class IncidenteSoporte {
    private String id;
    private String tipo;
    private String severidad;
    private EstadoIncidente estado;
    private LocalDateTime fechaApertura;
    private String clienteId; // Simplificado: referencia por id
    private String administradorAsignadoId; // Simplificado: referencia por id

    public IncidenteSoporte(String id, String tipo, String severidad, EstadoIncidente estado, LocalDateTime fechaApertura, String clienteId) {
        this.id = id;
        this.tipo = tipo;
        this.severidad = severidad;
        this.estado = estado;
        this.fechaApertura = fechaApertura;
        this.clienteId = clienteId;
    }

    public void escalar() { this.estado = EstadoIncidente.ESCALADO; }

    public String getId() { return id; }
    public String getTipo() { return tipo; }
    public String getSeveridad() { return severidad; }
    public EstadoIncidente getEstado() { return estado; }
    public LocalDateTime getFechaApertura() { return fechaApertura; }
    public String getClienteId() { return clienteId; }
    public String getAdministradorAsignadoId() { return administradorAsignadoId; }
    public void asignarAdministrador(String adminId){ this.administradorAsignadoId = adminId; }
}
