package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class ExpendedorTest {
    private Expendedor expendedor;
    @BeforeEach
    void setUp() {
        expendedor = new Expendedor(3,Precios.BEBIDAS,Precios.DULCES);
    }
    @Test
    @DisplayName("Test Una Productos")
    public void testComprarUnProducto() throws Exception {
        System.out.println("comprarUnProducto");
        Moneda pago = new Moneda1000();
        assertNotNull(expendedor.comprarProducto(pago,Productos.COCA));
    }

    @Test
    @DisplayName("Test Tres Productos")
    public void testComprarTresProductos() throws Exception {
        Moneda pago = new Moneda1000();
        assertNotNull(expendedor.comprarProducto(pago,Productos.COCA));
        assertNotNull(expendedor.comprarProducto(pago,Productos.COCA));
        assertNotNull(expendedor.comprarProducto(pago,Productos.COCA));
    }
    @Test
    @DisplayName("Test PagoIncorrectoException")
    public void testComprarConMonedaNull() throws PagoInsuficienteException{
        Moneda pago = null;
        Exception exception = assertThrows(PagoIncorrectoException.class, ()->{
            expendedor.comprarProducto(pago,Productos.COCA);
        });
    }
    @Test
    @DisplayName("Test NoHayProductoException")
    public void testComprarCuatroProductos() throws NoHayProductoException{
        Moneda pago = new Moneda1000();
        Exception exception = assertThrows(NoHayProductoException.class,()->{
            expendedor.comprarProducto(pago,Productos.COCA);
            expendedor.comprarProducto(pago,Productos.COCA);
            expendedor.comprarProducto(pago,Productos.COCA);
            expendedor.comprarProducto(pago,Productos.COCA);
        });
    }
    @Test
    @DisplayName("Test PagoInsuficienteException")
    public void testComprarProductoSinSuficienteMoneda() throws PagoInsuficienteException{
        Moneda pago = new Moneda500();
        Exception exception = assertThrows(PagoInsuficienteException.class, ()->{
            expendedor.comprarProducto(pago,Productos.COCA);
        });
    }
}