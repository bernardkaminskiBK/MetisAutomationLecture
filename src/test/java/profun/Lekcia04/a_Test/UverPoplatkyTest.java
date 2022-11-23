package profun.Lekcia04.a_Test;


import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia02.a.NasobokCisla;
import profun.Lekcia04.a.UverPoplatky;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class UverPoplatkyTest extends InputOutputStreamHelper {

    @ParameterizedTest
    @CsvSource(value = {"10000, 8, 365, 800, -1", "5000, 3, 365, 150, -1", "120000, 2, 365, 2400, -1"})
    public void vypocitajUrokovuSadzbuTest(String firstInput, String secondInput, String thridInput, String expectedResult, String fourthInput) {

        final String input = firstInput + " " + secondInput + " " + thridInput + " " + fourthInput;
        provideInput(input);

        UverPoplatky.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
    }
}
