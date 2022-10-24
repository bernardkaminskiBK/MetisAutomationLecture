package profun.Lekcia06.b_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profun.Lekcia06.b.SucinNeparnychCisel;


public class SucinNeparnychTest {

    @Test
    public void sucinNeparnychCiselTest() {
        int actualResult = SucinNeparnychCisel.vypocitajSucinNeparnychCisel();
        int expectedResult = 2027025;

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
