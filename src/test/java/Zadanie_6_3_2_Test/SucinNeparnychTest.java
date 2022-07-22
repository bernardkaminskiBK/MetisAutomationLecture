package Zadanie_6_3_2_Test;

import Zadanie_6_3_2.SucinNeparnychCisel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SucinNeparnychTest {

    @Test
    public void sucinNeparnychCiselTest() {
        int actualResult = SucinNeparnychCisel.vypocitajSucinNeparnychCisel();
        int expectedResult = 2027025;

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
