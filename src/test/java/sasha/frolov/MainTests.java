package test.java.sasha.frolov;

import sasha.frolov.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MainTests {
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })

    void add(int first, int second, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.plus(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "5,    3,   2",
            "77,    70,   7",
            "49,  45, 4",
            "785,  45, 740"
    })

    void min(int first, int second, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.minus(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "4,    4,   16",
            "1,    0,   0",
            "5,  5, 25",
            "6,  8, 48"
    })

    void mult(int first, int second, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.multiplication(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "40,    4,   10",
            //"42424,    0,   0",
            "10,  5, 2",
            "8,  4, 2"
    })

    void div(int first, int second, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }
}
