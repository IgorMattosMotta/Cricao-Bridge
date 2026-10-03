package org.example;

public class FactoryMethod {

    private FactoryMethod() {};
    private static FactoryMethod instance = new FactoryMethod();
    public static FactoryMethod getInstance() {
        return instance;
    }

    public AbstractFactory getFabrica(String tipo, Formato formato) {
        if ("PF".equalsIgnoreCase(tipo)) {
            return new FabricaPF(formato);
        } else if ("PJ".equalsIgnoreCase(tipo)) {
            return new FabricaPJ(formato);
        } else {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
    }
}
