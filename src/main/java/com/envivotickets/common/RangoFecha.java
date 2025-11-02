
package com.envivotickets.common;

import java.time.LocalDate;
import java.util.Objects;

public class RangoFecha {
    private LocalDate inicio;
    private LocalDate fin;

    public RangoFecha(LocalDate inicio, LocalDate fin) {
        if (inicio != null && fin != null && fin.isBefore(inicio)) {
            throw new IllegalArgumentException("Fin no puede ser antes de inicio");
        }
        this.inicio = inicio;
        this.fin = fin;
    }

    public LocalDate getInicio() { return inicio; }
    public LocalDate getFin() { return fin; }

    public boolean incluye(LocalDate d) {
        if (d == null) return false;
        boolean afterStart = inicio == null || !d.isBefore(inicio);
        boolean beforeEnd = fin == null || !d.isAfter(fin);
        return afterStart && beforeEnd;
    }

    @Override
    public String toString() {
        return "RangoFecha{" + "inicio=" + inicio + ", fin=" + fin + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RangoFecha)) return false;
        RangoFecha that = (RangoFecha) o;
        return Objects.equals(inicio, that.inicio) && Objects.equals(fin, that.fin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inicio, fin);
    }
}
