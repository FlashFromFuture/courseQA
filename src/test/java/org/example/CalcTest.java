package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @ParameterizedTest(name = "#{index} - сложение {0} и {1} равно {2}")
    @CsvSource({"5, 5, 10", "-1, -2, -3"})
    @Tag("add")
    @DisplayName("Проверка сложения")
    void add(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.add(a, b);
        Assertions.assertEquals(expectedResult, result, "Неправильный ответ");

    }

    @ParameterizedTest(name = "#{index} - вычетание {1} из {0} равно {2}")
    @CsvSource({"10, 3, 7", "0, -2, 2", "-1, 4, -5"})
    @Tag("sub")
    @DisplayName("Проверка вычетания")
    void sub(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.sub(b,  a);
        Assertions.assertEquals(expectedResult, result, "Неправильный ответ" );

    }
}