package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DepositoBTest {
    private DepositoB depositob;
    ArrayList<Bebida> almB = new ArrayList<Bebida>();
    @BeforeEach
    void setUp() {
        depositob = new DepositoB();
    }
    @Test
    @DisplayName("Test Agrega Bebidas")
    void addBebida() {
        for (int i=0;i<3;i++){
            Bebida b1 = new CocaCola(100 + i);
            almB.add(b1);
            Bebida b2 = new Sprite(200 + i);
            almB.add(b2);
        }
    }

    @Test
    @DisplayName("Test Se Retira Una Bebida")
    void getBebida(){
        Bebida b1 = new CocaCola(100 );
        almB.add(b1);
        assertNotNull(almB.get(0));
        almB.remove(0);
    }
}