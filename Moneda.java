package org.example;

/**
 * Esta clase se encargara de crear y entregar informacion de una variable tipo Moneda
 */
public abstract class Moneda implements Comparable<Moneda>{
    /**
     * Metodo constructor vacio
     */
    public Moneda(){
    }

    /**
     * @return Retorna el numero de serie (Direccion de memoria) de la moneda creada
     */
    public Moneda getSerie(){
        return this;
    }

    /**
     * @return Retorna el valor de dicha moneda, que puede ser alguno de sus subclases
     */
    public abstract int getValor();

    /**
     * @return Retorna un string que entrega la informacion del valor de la moneda y su numero de serie
     */
    @Override
    public String toString(){
        return ("Valor: " + getValor() + " Serie: " + super.toString());
    }

    /**
     *
     * @param auxmon Es la moneda con la que se va a comparar
     * @return retorna un booleano, que indica la comparacion entre la moneda actual y una moneda ingresada por parametro, si es 1 son exactamente las mismas, sino son diferentes
     */
    @Override
    public int compareTo(Moneda auxmon){
        return Integer.compare(this.getValor(), auxmon.getValor());
    }
}


