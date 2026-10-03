package org.example;

public class ProcuracaoPF extends Procuracao {

    public ProcuracaoPF(Formato formato) {
        super(formato);
    }

    public String emitir() {
        return formato.aplicar("Procuração Pessoa Física");
    }
}
