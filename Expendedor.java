package org.example;

/**
 * Crea y almacena las variables a utilizar, Expendedor se encarga de almacenar y suministrar productos y monedas
 */
public class Expendedor{
    protected int preciosB;
    protected int preciosD;

    private DepositoB depcoca;
    private DepositoB depsprite;
    private DepositoD depsnickers;
    private DepositoD depsuper8;
    public static final int  COCA=1;
    public static final int  SPRITE=2;

    public static final int  SNICKERS=3;
    public static final int  SUPER8=4;
    DepositoM monVu = new DepositoM();

    /**
     * Metodo constructor, se encarga de crear y almacenar los productos, y definir los precios de cada uno
     * @param numProductos Indica cuanto stock de productos habra de bebidas y dulces por igual
     * @param precioBebidas Indica el precio de las bebidas por igual
     * @param precioDulces Indica el precio de los dulces por igual
     */
    public Expendedor(int numProductos, int precioBebidas, int precioDulces){
        preciosB = precioBebidas;
        preciosD = precioDulces;
        depcoca = new DepositoB();
        depsprite = new DepositoB();
        depsnickers = new DepositoD();
        depsuper8 = new DepositoD();
        for (int i=0;i<numProductos;i++){
            Bebida b1 = new CocaCola(100 + i);
            depcoca.addBebida(b1);
            Bebida b2 = new Sprite(200 + i);
            depsprite.addBebida(b2);
            Dulce d1 = new Snickers(300 + i);
            depsnickers.addDulce(d1);
            Dulce d2 = new Super8(400 + i);
            depsuper8.addDulce(d2);
        }
    }

    /**
     * Recibe parametros y revisa si cumple con ciertas condiciones de precio y stock para posteriormente entregar el producto
     * @param mon Identifica la moneda que se ingresa como medio de pago
     * @param cualP Identifica que producto se intenta comprar, ya sea dulce o bebida
     * @return Retorna un producto si es que cumple con todas las condiciones para obtenerlo y almacena vuelto si es necesario
     * @throws PagoIncorrectoException Si la moneda es null, entrega el mensaje de error
     * @throws NoHayProductoException Si no quedan productos del tipo que se pide en el almacen correspondiente, entrega este mensaje de error
     * @throws PagoInsuficienteException Si la moneda es de valor inferior al precio del producto, se entrega este mensaje de error
     */
    public Producto comprarProducto(Moneda mon, int cualP) throws PagoIncorrectoException, NoHayProductoException,PagoInsuficienteException{
        Producto p = null;
        if (mon!=null){
            if ((cualP==1)||(cualP==2)){
                if (mon.getValor()>=preciosB){
                    switch (cualP){
                        case COCA:  p = depcoca.getBebida(); break;
                        case SPRITE:  p = depsprite.getBebida(); break;
                        default: break;
                    }
                    if (p!=null){
                        for (int i = 0;i<((mon.getValor()-preciosB)/100);i++){
                            Moneda mon1 = new Moneda100();
                            monVu.addMoneda(mon1);
                        }
                    }else {
                        Moneda mon1 = mon;
                        monVu.addMoneda(mon1);
                        if (cualP==COCA){
                            throw new NoHayProductoException("No hay productos del tipo : CocaCola");
                        }else{
                            throw new NoHayProductoException("No hay productos del tipo : Sprite");
                        }
                    }
                }else{
                    Moneda mon1 = mon;
                    monVu.addMoneda(mon1);
                    throw new PagoInsuficienteException("El monto ingresado no es suficiente");
                }
            }else{
                if (mon.getValor()>=preciosD){
                    switch (cualP){
                        case SNICKERS:  p = depsnickers.getDulce(); break;
                        case SUPER8:  p = depsuper8.getDulce(); break;
                        default: break;
                    }
                    if(p!=null){
                        for (int i = 0;i<((mon.getValor()-preciosD)/100);i++){
                            Moneda mon1 = new Moneda100();
                            monVu.addMoneda(mon1);
                        }
                    }else {
                        Moneda mon1 = mon;
                        monVu.addMoneda(mon1);
                        if (cualP==SNICKERS){
                            throw new NoHayProductoException("No hay productos del tipo : Snickers");
                        }else{
                            throw new NoHayProductoException("No hay productos del tipo : Super8");
                        }
                    }
                }else{
                    Moneda mon1 = mon;
                    monVu.addMoneda(mon1);
                    throw new PagoInsuficienteException("El monto ingresado no es suficiente");
                }
            }
            return p;
        }else{
            throw new PagoIncorrectoException("Moneda invalida : " + mon);
        }
    }

    /**
     * Solo returna una moneda, por lo que puede ser necesario llamarla varias veces para recibir todo el vuelto
     * @return Retorna una unica moneda de todo el vuelto que se almaceno
     */
    public Moneda getVuelto(){
        Moneda m = monVu.getMoneda();
        return m;
    }
}