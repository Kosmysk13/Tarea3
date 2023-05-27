package org.example;

/**
 * Esta clase se encarga de "juntar" las clases Dulce y Bebida en una sola, para trabajar solo con Producto
 */

public abstract class Producto{
    private int numserie;

    /**
     * Metodo constructor que almacena el numero de serie del producto en una variable privada
     * @param Serie Es el numero de serie del producto recibido
     */
    public Producto(int Serie){
        numserie=Serie;
    }

    /**
     * Metodo abstracto que indica que se consume
     * @return retorna el producto que se consume a modo de String
     */
    public abstract String consumir();

    /**
     * @param p Es el producto que se quiere obtener su numero de serie
     * @return retorna el numero de serie del producto
     */
    public int getSerie(Producto p){
        return numserie;
    }
}