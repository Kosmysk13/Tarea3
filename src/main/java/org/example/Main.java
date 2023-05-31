package org.example;
public class Main {
    public static void main(String[] args){
        Moneda mon1 = new Moneda1000();
        Moneda mon2 = new Moneda1000();
        Moneda mon3 = new Moneda1000();
        Moneda mon4 = new Moneda500();
        Moneda mon5 = mon3;
        System.out.println(mon3.getSerie());
        System.out.println(mon3.compareTo(mon5));
        Expendedor ex = new Expendedor(3, Precios.BEBIDAS, Precios.DULCES);
        Comprador c1 = null;
        Comprador c2 = null;
        Comprador c3 = null;
        Comprador c4 = null;
        try {
            c1 = new Comprador(mon1, Productos.COCA,ex);
            c2 = new Comprador(mon2, Productos.SPRITE,ex);
            c3 = new Comprador(mon3, Productos.SNICKERS,ex);
            c4 = new Comprador(mon4, Productos.SUPER8,ex);
        } catch (PagoIncorrectoException e) {
            throw new RuntimeException(e);
        } catch (NoHayProductoException e) {
            throw new RuntimeException(e);
        } catch (PagoInsuficienteException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c1.queConsumio()+" $"+c1.cuantoVuelto());
        System.out.println(c2.queConsumio()+" $"+c2.cuantoVuelto());
        System.out.println(c3.queConsumio()+" $"+c3.cuantoVuelto());
        System.out.println(c4.queConsumio()+" $"+c4.cuantoVuelto());
    }
}
