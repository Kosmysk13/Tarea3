package org.example;

public class Moneda500 extends Moneda{
    private int valmon=500;
    public Moneda500(){
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
