package org.example;

public class Calc {

    public int add(int a, int b) {
        int result;
        result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равна " + result);
        return result;
    }

    public int sub (int a, int b) {
        int result;
        result = b - a;
        System.out.println("Вычетание " + a + " из " + b + " равно " + result);
        return result;
    }
}
