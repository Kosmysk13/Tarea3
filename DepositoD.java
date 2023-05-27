package org.example;
import java.util.ArrayList;
/**
 * Deposito que almacenara dulces mediante un arraylist
 */

public class DepositoD{
    Dulce dul = null;
    ArrayList<Dulce> almD = new ArrayList<Dulce>();
    /**
     * Metodo constructor vacio
     */
    public DepositoD(){
    }
    /**
     * Agrega un dulce que recibe como parametro al deposito o arraylist creado
     * @param dulce Es el dulce que se agregara al deposito
     */
    public void addDulce(Dulce dulce){
        almD.add(dulce);
    }
    /**
     * Retirara un dulce del deposito
     * @return Retorna una variable tipo Dulce que corresponde al primer dulce que esta guardado en el deposito
     */
    public Dulce getDulce(){
        if (almD.size()>0){
            Dulce d1 = almD.get(0);
            almD.remove(0);
            return d1;
        }else{
            return null;
        }
    }
}