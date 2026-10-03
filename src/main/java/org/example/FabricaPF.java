package org.example;

public class FabricaPF implements AbstractFactory {

    private Formato formato;

    public FabricaPF(Formato formato) {
        this.formato = formato;
    }

    @Override
    public Contrato createContrato() {
        return new ContratoPF(formato);
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPF(formato);
    }
}
