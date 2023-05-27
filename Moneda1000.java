package org.example;

public class Moneda1000 extends Moneda{
    private int valmon=1000;
    public Moneda1000(){
        super();
    }
    public int getValor(){
        return valmon;
    }
    @Override
    public int compareTo(Moneda o) {
        if (this==o){
            return 1;
        }else{
            return 0;
        }
    }
}
