package org.example;
import java.util.ArrayList;
/**
 * Deposito que almacenara monedas mediante un arraylist
 */
public class DepositoM{
    Moneda mon = null;
    ArrayList<Moneda> almM = new ArrayList<Moneda>();
    /**
     * Metodo constructor vacio
     */
    public DepositoM(){
    }
    /**
     * Agrega una moneda que recibe como parametro al deposito o arraylist creado
     * @param mone Es la moneda que se agregara al deposito
     */
    public void addMoneda(Moneda mone){
        almM.add(mone);
    }
    /**
     * Retirara una moneda del deposito
     * @return Retorna una variable tipo moneda que corresponde a la primera que esta guardada en el deposito
     */
    public Moneda getMoneda(){
        if (almM.size()>0){
            Moneda m1 = almM.get(0);
            almM.remove(0);
            return m1;
        }else{
            return null;
        }
    }
}