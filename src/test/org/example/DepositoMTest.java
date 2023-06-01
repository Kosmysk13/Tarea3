package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DepositoMTest {
    private DepositoM depositom;
    ArrayList<Moneda> almM = new ArrayList<Moneda>();
    @BeforeEach
    void setUp() {
        depositom = new DepositoM();
    }

    @Test
    @DisplayName("Test Se Agrega Moneda")
    void addMoneda() {
        Moneda m1 = new Moneda1000();
        almM.add(m1);
    }

    @Test
    @DisplayName("Test Se Retira Una Moneda")
    void getMoneda() {
        Moneda m1 = new Moneda1000();
        almM.add(m1);
        assertNotNull(almM.get(0));
        almM.remove(0);
    }
}