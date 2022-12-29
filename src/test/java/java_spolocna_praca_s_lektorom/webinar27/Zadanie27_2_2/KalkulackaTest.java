package java_spolocna_praca_s_lektorom.webinar27.Zadanie27_2_2;

import javazaklady.lecture27.activity2.Zadanie_27_2_2.Kalkulacka;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class KalkulackaTest {
    @ParameterizedTest
    @CsvSource(value = {"1,1,2", "2,2,4", "5,5,10"})
    void kalkulackaTest(int a, int b, int expectedResult)
    {
        Kalkulacka kalkulacka = new Kalkulacka();
        int actualResult = kalkulacka.spocitaj(a, b);
        assertEquals(expectedResult,actualResult, "Result should be : " + expectedResult);

    }
}
