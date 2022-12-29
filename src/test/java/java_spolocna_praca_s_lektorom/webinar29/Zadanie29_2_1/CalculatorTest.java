package java_spolocna_praca_s_lektorom.webinar29.Zadanie29_2_1;


import javazaklady.lecture29.activity2.Zadanie_29_2_1.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"1,1,2", "2,2,4", "5,5,10"})
    void kalkulackaTest(int a, int b, int expectedResult)
    {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(a, b);
        assertEquals(expectedResult,actualResult, "Result should be : " + expectedResult);

    }
}
