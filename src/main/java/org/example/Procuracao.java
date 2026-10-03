package org.example;

public abstract class Procuracao {

    protected Formato formato;

    public Procuracao(Formato formato) {
        this.formato = formato;
    }

    public abstract String emitir();
}
