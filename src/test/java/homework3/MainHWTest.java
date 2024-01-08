package homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    MainHW main;

    @BeforeEach
    void setUp() {
        main = new MainHW();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4})
    void posEvenOddNumber(int num) {
        assertTrue(main.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3})
    void negEvenOddNumber(int num) {
        assertFalse(main.evenOddNumber(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 30, 55, 99})
    void posNumberInInterval(int n) {
        assertTrue(main.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 25, 100, 1000000})
    void negNumberInInterval(int n) {
        assertFalse(main.numberInInterval(n));
    }
}