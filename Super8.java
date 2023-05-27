package org.example;
/**
 * Entrega los valores de serie y un string del producto que se consume a las superclases
 */
class Super8 extends Dulce{
    public Super8(int serie){
        super(serie);
    }
    public String consumir(){
        return "super8";
    }
}