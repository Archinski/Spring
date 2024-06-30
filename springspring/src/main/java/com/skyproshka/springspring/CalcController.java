package com.skyproshka.springspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    @RequestMapping("/calculator")
public class CalcController {
        private CalcService CalcService;

        public CalcController(com.skyproshka.springspring.CalcService calcService) {
            this.CalcService = calcService;
        }

        @GetMapping()
        public String hello() {
            return "Добро пожаловать в калькулятор!";
        }
        @GetMapping("/plus")
            public String getSum(@RequestParam(value = "num1") Integer num1,
                                 @RequestParam(value = "num2") Integer num2) {
            if (num1 == null || num2 == null){
                return "Что то поломалось";
            }
            int result = CalcService.getSum(num1,num2);
            return num1 + " + " + num2 + " = " + result;
        }
        @GetMapping("/minus")
        public String getSub(@RequestParam(value = "num1") Integer num1,
                             @RequestParam(value = "num2") Integer num2) {
            if (num1 == null || num2 == null) {
                return "Что то поломалось";
            }
            int result = CalcService.getSub(num1,num2);
            return num1 + " - " + num2 + " = " + result;
        }
        @GetMapping("/mult")
        public String getMult(@RequestParam(value = "num1") Integer num1,
                             @RequestParam(value = "num2") Integer num2) {
            if (num1 == null || num2 == null) {
                return "Что то поломалось";
            }
            int result = CalcService.getMult(num1,num2);
            return num1 + " * " + num2 + " = " + result;
        }
        @GetMapping("/divide")
        public String getDiv(@RequestParam(value = "num1") Integer num1,
                              @RequestParam(value = "num2") Integer num2) {
            if (num1 == null || num2 == null) {
                return "Что то поломалось";
            }
            int result = CalcService.getDiv(num1,num2);
            return num1 + " / " + num2 + " = " + result;
        }
    }