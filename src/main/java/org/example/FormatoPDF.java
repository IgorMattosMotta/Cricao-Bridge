package org.example;

public class FormatoPDF implements Formato {

    public String aplicar(String conteudo) {
        return "[PDF] " + conteudo;
    }
}
