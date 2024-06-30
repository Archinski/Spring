package com.skyproshka.springspring;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public int getSum(int num1, int num2){
       return num1 + num2;
    }
    public int getSub(int num1, int num2) {
        return Integer.parseInt(num1 + " - " + num2 + " = " + (num1 + num2));
    }
    public int getMult(int num1, int num2) {
            return Integer.parseInt(num1 + " * " + num2 + " = " + (num1 + num2));
        }
    public int getDiv(int num1, int num2) {
        return Integer.parseInt(num1 + " / " + num2 + " = " + (num1 + num2));
    }
}

