package org.example;

public class Moneda1500 extends Moneda{
    private int valmon=1500;
    public Moneda1500(){
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
