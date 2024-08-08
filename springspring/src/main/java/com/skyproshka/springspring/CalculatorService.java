package com.skyproshka.springspring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public static int getSum(int num1, int num2) {
        return num1 + num2;
    }

    public static int getSub(int num1, int num2) {
        return num1 - num2;
    }

    public static int getMult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getDiv(int num1, int num2) {
        if (num2 == 0){
            throw new IllegalArgumentException("На ноль не делим");
        }
        return num1 / num2;
    }
}

