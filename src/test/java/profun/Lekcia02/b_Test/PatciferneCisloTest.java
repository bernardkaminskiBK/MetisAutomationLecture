package profun.Lekcia02.b_Test;



import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia02.a.NasobokCisla;
import profun.Lekcia02.b.PatciferneCislo;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class PatciferneCisloTest extends InputOutputStreamHelper {

    @ParameterizedTest
    @CsvSource(value = {"59955,5   9   9   5   5","59988,5   9   9   8   8","98888,9   8   8   8   8"})
    public void pridajMedzeryTest(String cislo,String expectedResult) {
        final String input = cislo;
        provideInput(input);
//        String actualResult = PatciferneCislo.pridajMedzery(cislo);
        PatciferneCislo.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
    }
}
