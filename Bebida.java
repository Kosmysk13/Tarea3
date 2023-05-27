package org.example;

/**
 * Clase abstracta de bebida que solo funciona como intermediario entre Producto y la bebida elegida
 * Contiene un metodo consumir que guardaria la bebida que se consume como String
 */
public abstract class Bebida extends Producto{
    public Bebida(int numSerie){
        super(numSerie);
    }
    public abstract String consumir();
}

