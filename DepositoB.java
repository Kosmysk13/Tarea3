package org.example;
import java.util.ArrayList;

/**
 * Deposito que almacenara bebidas mediante un arraylist
 */

public class DepositoB{
    Bebida b = null;
    ArrayList<Bebida> almB = new ArrayList<Bebida>();

    /**
     * Metodo constructor vacio
     */
    public DepositoB(){
    }

    /**
     * Agrega una bebida que recibe como parametro al deposito o arraylist creado
     * @param beb Es la bebida que se agregara al deposito
     */
    public void addBebida(Bebida beb){
        almB.add(beb);
    }

    /**
     * Retirara una bebida del deposito
     * @return Retorna una variable tipo Bebida que corresponde a la primera que esta guardada en el deposito
     */
    public Bebida getBebida(){
        if (almB.size()>0){
            Bebida b1 = almB.get(0);
            almB.remove(0);
            return b1;
        }else{
            return null;
        }
    }
}