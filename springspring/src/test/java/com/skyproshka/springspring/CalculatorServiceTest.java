package com.skyproshka.springspring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void getSumTest() {
        assertEquals(10, calculatorService.getSum(5, 5));
        assertEquals(15, calculatorService.getSum(10, 5));
    }

    @Test
    void getSubTest() {
        assertEquals(0, calculatorService.getSub(5, 5));
        assertEquals(5, calculatorService.getSub(10, 5));
    }

    @Test
    void getMultTest() {
        assertEquals(25, calculatorService.getMult(5, 5));
        assertEquals(50, calculatorService.getMult(10, 5));
    }

    @Test
    void getDivTest() {
        assertEquals(1, calculatorService.getDiv(5, 5));
        assertEquals(2, calculatorService.getDiv(10, 5));
    }

    @Test
    void getDivByZeroTest() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculatorService.getDiv(5, 0);
                });
    }
}

