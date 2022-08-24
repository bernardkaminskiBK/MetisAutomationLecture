package profun.Zadanie_2_3_2_test;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Zadanie_2_3_2.PatciferneCislo;


public class PatciferneCisloTest {

    @ParameterizedTest
    @CsvSource(value = {"59955,5   9   9   5   5","59988,5   9   9   8   8","98888,9   8   8   8   8"})
    public void pridajMedzeryTest(int cislo,String expectedResult) {

        String actualResult = PatciferneCislo.pridajMedzery(cislo);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
