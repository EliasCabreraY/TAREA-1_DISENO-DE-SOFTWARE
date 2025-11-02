
package com.envivotickets.domain.eventos;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private UUID id;
    private String titulo;
    private String tipo;
    private String descripcion;
    private PoliticaCancelacion politicaCancelacion;
    private List<Funcion> funciones = new ArrayList<>();

    public Evento(UUID id, String titulo, String tipo, String descripcion, PoliticaCancelacion politica) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.politicaCancelacion = politica;
    }

    public UUID getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getTipo() { return tipo; }
    public String getDescripcion() { return descripcion; }
    public PoliticaCancelacion getPoliticaCancelacion() { return politicaCancelacion; }
    public List<Funcion> getFunciones() { return funciones; }

    public void agregarFuncion(Funcion f) { if (f != null) funciones.add(f); }
}
