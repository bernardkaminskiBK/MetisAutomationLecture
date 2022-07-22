package Zadanie_6_3_3_Test;

import Zadanie_6_3_3.Faktorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FaktorialTest {

    @Test
    public void vypisDoKonzolyTest() {
        String actualResult = Faktorial.vypisDoKonzoly();
        String expectedResult =
                "Cislo\tFaktorial\n" +
                        "1\t\t1\n" +
                        "2\t\t2\n" +
                        "3\t\t6\n" +
                        "4\t\t24\n" +
                        "5\t\t120\n";

        Assertions.assertEquals(expectedResult, actualResult);
    }


    @ParameterizedTest
    @CsvSource(value = {"1,1", "2,2", "3,6", "4,24", "5,120"})
    public void vypisDoKonzolyTest(int n, int expectedResult) {
        int actualResult = Faktorial.vypocitajFaktorial(n);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
