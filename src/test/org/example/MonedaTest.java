package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonedaTest {
    private Moneda mon1,mon2,mon3,mon4;
    @BeforeEach
    void setUp() {
        mon1 = new Moneda100();
        mon2 = new Moneda500();
        mon3 = new Moneda1000();
        mon4 = new Moneda1500();
    }

    @Test
    @DisplayName("Test Diferentes Monedas")
    void testDiferentesMonedas(){
        assertNotEquals(mon1,mon2);
        assertNotEquals(mon1,mon3);
        assertNotEquals(mon1,mon4);
        assertNotEquals(mon2,mon3);
        assertNotEquals(mon2,mon4);
        assertNotEquals(mon3,mon4);
    }

    @Test
    @DisplayName("Test Valor de Monedas")
    void testValoresMonedas(){
        assertEquals(100,mon1.getValor());
        assertEquals(500,mon2.getValor());
        assertEquals(1000,mon3.getValor());
        assertEquals(1500,mon4.getValor());
    }
}