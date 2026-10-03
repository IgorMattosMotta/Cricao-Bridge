package org.example;

public abstract class Contrato {

    protected Formato formato;

    public Contrato(Formato formato) {
        this.formato = formato;
    }

    public abstract String emitir();
}
