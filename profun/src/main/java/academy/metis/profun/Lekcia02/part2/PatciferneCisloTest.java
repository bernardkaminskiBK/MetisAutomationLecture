package academy.metis.profun.Lekcia02.part2;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class PatciferneCisloTest {

    @ParameterizedTest
    @CsvSource(value = {"59955,5   9   9   5   5","59988,5   9   9   8   8","98888,9   8   8   8   8"})
    public void pridajMedzeryTest(int cislo,String expectedResult) {

        String actualResult = PatciferneCislo.pridajMedzery(cislo);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
