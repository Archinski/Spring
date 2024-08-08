package com.skyproshka.springspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void getSumTest() {
        Assertions.assertEquals(10, calculatorService.getSum(5, 5));
        Assertions.assertEquals(15, calculatorService.getSum(10, 5));
    }

    @Test
    void getSubTest() {
        Assertions.assertEquals(0, calculatorService.getSub(5, 5));
        Assertions.assertEquals(5, calculatorService.getSub(10, 5));
    }

    @Test
    void getMultTest() {
        Assertions.assertEquals(25, calculatorService.getMult(5, 5));
        Assertions.assertEquals(50, calculatorService.getMult(10, 5));
    }

    @Test
    void getDivTest() {
        Assertions.assertEquals(1, calculatorService.getDiv(5, 5));
        Assertions.assertEquals(2, calculatorService.getDiv(10, 5));
    }

    @Test
    void getDivByZeroTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    calculatorService.getDiv(5, 0);
                });
    }
}

