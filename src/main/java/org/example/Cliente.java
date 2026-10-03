package org.example;

public class Cliente {

    private Contrato contrato;
    private Procuracao procuracao;

    public Cliente(AbstractFactory fabrica) {
        this.contrato = fabrica.createContrato();
        this.procuracao = fabrica.createProcuracao();
    }

    public String emitirContrato() {
        return this.contrato.emitir();
    }

    public String emitirProcuracao() {
        return this.procuracao.emitir();
    }
}
