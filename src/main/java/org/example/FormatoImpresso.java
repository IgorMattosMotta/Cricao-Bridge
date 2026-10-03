package org.example;

public class FormatoImpresso implements Formato {

    public String aplicar(String conteudo) {
        return "[Impresso] " + conteudo;
    }
}
