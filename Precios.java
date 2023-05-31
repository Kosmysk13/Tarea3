package org.example;

public enum Precios {
    BEBIDAS (1000),
    DULCES (500);
    private int valor;

    Precios(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
