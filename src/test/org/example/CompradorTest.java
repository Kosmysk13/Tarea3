package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompradorTest {
    private Comprador comprador;
    private Expendedor expendedor;
    private Moneda moneda;
    @BeforeEach
    void setUp() {
        expendedor = new Expendedor(3,Precios.BEBIDAS,Precios.DULCES);
    }
    @Test
    @DisplayName("Test Una Compra")
    public void testUnaCompra() throws Exception {
        System.out.println("UnaCompra");
        moneda = new Moneda1000();
        comprador = new Comprador(moneda,Productos.COCA,expendedor);
    }
    @Test
    @DisplayName("Test Dos Compras")
    public void testDosCompras() throws Exception {
        System.out.println("DosCompra");
        moneda = new Moneda1000();
        assertNotNull(comprador = new Comprador(moneda,Productos.COCA,expendedor));
        assertNotNull(comprador = new Comprador(moneda,Productos.SPRITE,expendedor));
    }
    @Test
    @DisplayName("Test PagoIncorrectoException")
    public void testCompraMonedaNull() throws PagoIncorrectoException{
        Moneda pago = null;
        Exception exception = assertThrows(PagoIncorrectoException.class, ()->{
            expendedor.comprarProducto(pago,Productos.COCA);
        });
    }
    @Test
    @DisplayName("Test NoHayProductoException")
    public void testCompraSinProductos() throws Exception {
        System.out.println("CompraSinProductos");
        moneda = new Moneda1000();
        Exception exception = assertThrows(NoHayProductoException.class, ()->{
            assertNotNull(comprador = new Comprador(moneda,Productos.COCA,expendedor));
            assertNotNull(comprador = new Comprador(moneda,Productos.COCA,expendedor));
            assertNotNull(comprador = new Comprador(moneda,Productos.COCA,expendedor));
            assertNotNull(comprador = new Comprador(moneda,Productos.COCA,expendedor));
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
    @Test
    @DisplayName("Test Entrega Vuelto")
    void cuantoVuelto() throws Exception {
        moneda = new Moneda1000();
        comprador = new Comprador(moneda,Productos.COCA,expendedor);
        assertNotNull(comprador.cuantoVuelto());
    }

    @Test
    @DisplayName("Test Que Consume")
    void queConsumio() throws Exception {
        moneda = new Moneda1000();
        comprador = new Comprador(moneda,Productos.COCA,expendedor);
        assertNotNull(comprador.queConsumio());
    }
}