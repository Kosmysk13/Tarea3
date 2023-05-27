package org.example;

/**
 * Entrega los valores de serie y un string del producto que se consume a las superclases
 */
public class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    public String consumir(){
        return "cocacola";
    }
}
