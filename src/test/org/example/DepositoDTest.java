package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DepositoDTest {
    private DepositoD depositod;
    ArrayList<Dulce> almD = new ArrayList<Dulce>();
    @BeforeEach
    void setUp() {
        depositod = new DepositoD();
    }
    @Test
    @DisplayName("Test Se Agregan Dulces")
    void addDulce() {
        for (int i=0;i<3;i++){
            Dulce d1 = new Snickers(300 + i);
            almD.add(d1);
            Dulce d2 = new Super8(400 + i);
            almD.add(d2);
        }
    }

    @Test
    @DisplayName("Test Se Retira Un Dulce")
    void getDulce() {
        Dulce d1 = new Snickers(300 );
        almD.add(d1);
        assertNotNull(almD.get(0));
        almD.remove(0);
    }
}