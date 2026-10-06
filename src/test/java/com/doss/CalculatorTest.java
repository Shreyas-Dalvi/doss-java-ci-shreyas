package com.doss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    void addTest() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    void subtractTest() {
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    void multiplyTest() {
        assertEquals(50, c.multiply(10, 5));
    }
}
