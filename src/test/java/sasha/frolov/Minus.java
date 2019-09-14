package test.java.sasha.frolov;

import main.java.sasha.frolov.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Minus {
    @Test
    @DisplayName("3 - 1 = 2")
    void addsTwoNumbers() {
        Main main = new Main();
        assertEquals(2, main.minus(3, 1), "3 - 1 should equal 2");
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
}