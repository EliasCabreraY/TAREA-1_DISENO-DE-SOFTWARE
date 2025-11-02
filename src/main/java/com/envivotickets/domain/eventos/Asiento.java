
package com.envivotickets.domain.eventos;

public class Asiento {
    private String fila;
    private int numero;
    private boolean accesible;

    public Asiento(String fila, int numero, boolean accesible) {
        this.fila = fila;
        this.numero = numero;
        this.accesible = accesible;
    }

    public String getFila() { return fila; }
    public int getNumero() { return numero; }
    public boolean isAccesible() { return accesible; }

    public String key(){ return fila + "-" + numero; }
}
