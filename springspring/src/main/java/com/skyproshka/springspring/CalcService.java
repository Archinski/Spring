package com.skyproshka.springspring;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public static int getSum(int num1, int num2){
       return num1 + num2;
    }
    public static int getSub(int num1, int num2) {
        return Integer.parseInt(num1 + " - " + num2 + " = " + (num1 + num2));
    }
    public static int getMult(int num1, int num2) {
            return Integer.parseInt(num1 + " * " + num2 + " = " + (num1 + num2));
        }
    public static int getDiv(int num1, int num2) {
        return Integer.parseInt(num1 + " / " + num2 + " = " + (num1 + num2));
    }
}

