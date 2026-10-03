package org.example;

public class ProcuracaoPJ extends Procuracao {

    public ProcuracaoPJ(Formato formato) {
        super(formato);
    }

    public String emitir() {
        return formato.aplicar("Procuração Pessoa Jurídica");
    }
}
