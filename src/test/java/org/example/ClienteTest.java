package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        AbstractFactory fabrica = new FabricaPF(new FormatoPDF());
        Cliente cliente = new Cliente(fabrica);
        assertEquals("[PDF] Contrato Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirContratoPJ() {
        AbstractFactory fabrica = new FabricaPJ(new FormatoPDF());
        Cliente cliente = new Cliente(fabrica);
        assertEquals("[PDF] Contrato Pessoa Jurídica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        AbstractFactory fabrica = new FabricaPF(new FormatoPDF());
        Cliente cliente = new Cliente(fabrica);
        assertEquals("[PDF] Procuração Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        AbstractFactory fabrica = new FabricaPJ(new FormatoPDF());
        Cliente cliente = new Cliente(fabrica);
        assertEquals("[PDF] Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

    @Test
    void fabricaPFDeveUsarFormatoRecebido() {
        Cliente cliente = new Cliente(new FabricaPF(new FormatoImpresso()));
        assertEquals("[Impresso] Contrato Pessoa Física", cliente.emitirContrato());
        assertEquals("[Impresso] Procuração Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void fabricaPJDeveUsarFormatoRecebido() {
        Cliente cliente = new Cliente(new FabricaPJ(new FormatoImpresso()));
        assertEquals("[Impresso] Contrato Pessoa Jurídica", cliente.emitirContrato());
        assertEquals("[Impresso] Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

}
