
package com.envivotickets.domain.eventos;

public class PoliticaCancelacion {
    private int ventanaHoras;
    private double penalidadPct;

    public PoliticaCancelacion(int ventanaHoras, double penalidadPct) {
        this.ventanaHoras = ventanaHoras;
        this.penalidadPct = penalidadPct;
    }

    public int getVentanaHoras() { return ventanaHoras; }
    public double getPenalidadPct() { return penalidadPct; }
}
