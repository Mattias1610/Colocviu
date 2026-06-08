package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudetTest {

    @Test
    public void testCreareJudet() {
        Judet judet = new Judet("CJ", "Cluj", "Vest", 500000, 5000);

        assertEquals("CJ", judet.getCod());
        assertEquals("Cluj", judet.getNumeJudet());
        assertEquals("Vest", judet.getRegiuneDezvoltare());
        assertEquals(500000, judet.getNrLocuitori());
        assertEquals(5000, judet.getSuprafata());
    }
}