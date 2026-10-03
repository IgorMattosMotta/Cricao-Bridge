package org.example;

public class FabricaPJ implements AbstractFactory {

    private Formato formato;

    public FabricaPJ(Formato formato) {
        this.formato = formato;
    }

    @Override
    public Contrato createContrato() {
        return new ContratoPJ(formato);
    }

    @Override
    public Procuracao createProcuracao() {
        return new ProcuracaoPJ(formato);
    }
}
