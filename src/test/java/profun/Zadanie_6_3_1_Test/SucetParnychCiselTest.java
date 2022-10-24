package profun.Zadanie_6_3_1_Test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import profun.Lekcia06.Zadanie_6_3_1.SucetParnychCisel;


import static org.junit.jupiter.api.Assertions.assertTrue;


public class SucetParnychCiselTest {

    @Test
    public void sucetParnychCiselTest() {
       int actualResult = SucetParnychCisel.vypocitajSucetParnychCisel();
       int expectedResult = 240;

       Assertions.assertEquals(expectedResult,actualResult);

        assertTrue(actualResult==expectedResult,"false");
    }
}
