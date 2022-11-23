package profun.Lekcia02.a_Test;

import base.InputOutputStreamHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia02.a.NasobokCisla;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class NasobokCislaTest extends InputOutputStreamHelper {

    @ParameterizedTest
    @CsvSource(value = {"50,50,1", "88,50,nie je deliteľné", "33,50,nie je deliteľné"})
    public void overCisloTest(String firstInput, String secondInput, String expectedResult) {
        final String input = firstInput + " " + secondInput;
        provideInput(input);

        NasobokCisla.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
    }

}
