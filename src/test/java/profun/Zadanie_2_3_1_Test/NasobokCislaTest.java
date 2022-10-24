package profun.Zadanie_2_3_1_Test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia02.a.NasobokCisla;


public class NasobokCislaTest {

    @ParameterizedTest
    @CsvSource(value = {"50,50", "88,50", "33,50"})
    public void overCisloTest(int cislo1,int cislo2) {

        boolean actualResult = NasobokCisla.overCislo(cislo1,cislo2);

        if (cislo1 % cislo2 == 0) {
            Assertions.assertEquals(true, actualResult);

        } else {
            Assertions.assertEquals(false, actualResult);
        }
    }
}
