package org.Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void countFactorialSuccessTest() {
        assertEquals(6,Factorial.countFactorial(3));
    }

    @Test
    void countFactorialNotSuccessTest() {
        assertNotEquals(23,Factorial.countFactorial(4));
    }
}