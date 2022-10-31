package profun.Lekcia06.c_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia06.c.Faktorial;


public class FaktorialTest {

    @ParameterizedTest
    @CsvSource(value = {"1,1", "2,2", "3,6", "4,24", "5,120"})
    public void vypisDoKonzolyTest(int n, int expectedResult) {
       int actualResult = Faktorial.vypocitajFaktorial(n);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}