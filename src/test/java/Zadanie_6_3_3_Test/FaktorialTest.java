package Zadanie_6_3_3_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FaktorialTest {

    @ParameterizedTest
    @CsvSource(value = {"1,1", "2,2", "3,6", "4,24", "5,120"})
    public void vypisDoKonzolyTest(int n, int expectedResult) {
//        int actualResult = sk.itvkurze.antoska.zadanie_6_3_3.Faktorial.vypocitajFaktorial(n);
//        int actualResult = sk.itvkurze.hubay.zadanie_6_3_3.Faktorial.vypocitajFaktorial(n);
        int actualResult = sk.itvkurze.mesko.zadanie_6_3_3.Faktorial.vypocitajFaktorial(n);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
