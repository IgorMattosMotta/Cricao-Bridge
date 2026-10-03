package org.example;

public class ContratoPJ extends Contrato {

    public ContratoPJ(Formato formato) {
        super(formato);
    }

    public String emitir() {
        return formato.aplicar("Contrato Pessoa Jurídica");
    }
}
