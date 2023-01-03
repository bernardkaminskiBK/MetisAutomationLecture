package academy.metis.profun.lecture6.activity3.part2;

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
