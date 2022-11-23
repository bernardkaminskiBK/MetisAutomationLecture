package profun.Lekcia06.c_Test;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia02.a.NasobokCisla;
import profun.Lekcia06.c.Faktorial;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class FaktorialTest extends InputOutputStreamHelper {

    @ParameterizedTest
    @CsvSource(value = {"1,1", "2,2", "3,6", "4,24", "5,120"})
    public void vypisDoKonzolyTest(String firstInput, String expectedResult) {

        final String input = firstInput;
        provideInput(input);

        Faktorial.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));

        //int actualResult = Faktorial.vypocitajFaktorial(n);

        //Assertions.assertEquals(expectedResult, actualResult);
    }

}
