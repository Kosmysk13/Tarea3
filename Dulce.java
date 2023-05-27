package org.example;

/**
 * Clase abstracta de Dulce que solo funciona como intermediario entre Producto y el dulce elegido
 * Contiene un metodo consumir que guardaria el dulce que se consume como String
 */
public abstract class Dulce extends Producto {
    public Dulce(int numSerie){
        super(numSerie);
    }
    public abstract String consumir();
}