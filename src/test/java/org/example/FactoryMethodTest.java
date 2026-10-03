package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        assertSame(FactoryMethod.getInstance(), FactoryMethod.getInstance());
    }

    @Test
    void deveRetornarFabricaPF() {
        AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("PF", new FormatoPDF());
        assertInstanceOf(FabricaPF.class, fabrica);
    }

    @Test
    void deveRetornarFabricaPJ() {
        AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("PJ", new FormatoPDF());
        assertInstanceOf(FabricaPJ.class, fabrica);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> FactoryMethod.getInstance().getFabrica("PN", new FormatoPDF()));
        assertEquals("Fábrica inexistente", e.getMessage());
    }

    @Test
    void deveIgnorarMaiusculasEMinusculasNoTipo() {
        assertInstanceOf(FabricaPF.class, FactoryMethod.getInstance().getFabrica("pf", new FormatoPDF()));
        assertInstanceOf(FabricaPJ.class, FactoryMethod.getInstance().getFabrica("Pj", new FormatoPDF()));
    }

    @Test
    void deveRepassarFormatoParaAFabrica() {
        AbstractFactory fabrica = FactoryMethod.getInstance().getFabrica("PJ", new FormatoImpresso());
        Cliente cliente = new Cliente(fabrica);
        assertEquals("[Impresso] Contrato Pessoa Jurídica", cliente.emitirContrato());
        assertEquals("[Impresso] Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

}
