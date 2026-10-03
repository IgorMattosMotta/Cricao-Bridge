package org.example;

public class ContratoPF extends Contrato {

    public ContratoPF(Formato formato) {
        super(formato);
    }

    public String emitir() {
        return formato.aplicar("Contrato Pessoa Física");
    }
}
