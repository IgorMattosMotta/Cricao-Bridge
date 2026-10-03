package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BridgeTest {

    @Test
    void deveEmitirMesmoContratoEmFormatosDiferentes() {
        Contrato pdf = new ContratoPF(new FormatoPDF());
        Contrato impresso = new ContratoPF(new FormatoImpresso());
        assertEquals("[PDF] Contrato Pessoa Física", pdf.emitir());
        assertEquals("[Impresso] Contrato Pessoa Física", impresso.emitir());
    }

    @Test
    void deveAplicarMesmoFormatoEmDocumentosDiferentes() {
        Formato pdf = new FormatoPDF();
        assertEquals("[PDF] Contrato Pessoa Jurídica", new ContratoPJ(pdf).emitir());
        assertEquals("[PDF] Procuração Pessoa Jurídica", new ProcuracaoPJ(pdf).emitir());
    }

    @Test
    void deveAplicarFormatoImpressoEmTodosOsDocumentos() {
        Formato impresso = new FormatoImpresso();
        assertEquals("[Impresso] Contrato Pessoa Física", new ContratoPF(impresso).emitir());
        assertEquals("[Impresso] Contrato Pessoa Jurídica", new ContratoPJ(impresso).emitir());
        assertEquals("[Impresso] Procuração Pessoa Física", new ProcuracaoPF(impresso).emitir());
        assertEquals("[Impresso] Procuração Pessoa Jurídica", new ProcuracaoPJ(impresso).emitir());
    }
}
