package profun.Zadanie_6_3_2_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SucinNeparnychTest {

    @Test
    public void sucinNeparnychCiselTest() {
//        int actualResult = sk.itvkurze.antoska.zadanie_6_3_2.SucinNeparnychCisel.vypocitajSucinNeparnychCisel();
//        int actualResult = sk.itvkurze.hubay.zadanie_6_3_2.SucinNeparnychCisel.vypocitajSucinNeparnychCisel();
        int actualResult = sk.itvkurze.mesko.zadanie_6_3_2.SucinNeparnychCisel.vypocitajSucinNeparnychCisiel();
        int expectedResult = 2027025;

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
