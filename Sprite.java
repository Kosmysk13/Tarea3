package org.example;
/**
 * Entrega los valores de serie y un string del producto que se consume a las superclases
 */
public class Sprite extends Bebida{
    public Sprite(int serie){
        super(serie);
    }
    public String consumir(){
        return "sprite";
    }
}