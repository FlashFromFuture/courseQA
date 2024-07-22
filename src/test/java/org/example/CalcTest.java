package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        Calc calc = new Calc();
        int result = calc.add(4, 9);
        Assertions.assertEquals(13, result, "Неправильный ответ");

    }

    @Test
    void sub() {
        Calc calc = new Calc();
        int result = calc.sub(10, 6);
        Assertions.assertEquals(4, result, "Неправильный ответ" );
    }
}