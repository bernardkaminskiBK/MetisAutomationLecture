package profun_spolocna_praca_s_lektorom.Lekcia6.zadanie1;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia02.a.NasobokCisla;
import profun_spolocna_praca_s_lektorom.Lekcia06.zadanie1.SucetPostupnostCiselDoWhileTester;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SucetPostupnostCiselDoWhileTest extends InputOutputStreamHelper {

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 6, 9, 2, 7, 29"})
    public void sumWithDoWhileLoopTest(String firstInput, String secondInput, String thirdthInput, String fourthInput, String fivethInput, String sixthInput, String expectedResult) {
        String input = firstInput + " " + secondInput + " " + thirdthInput + " " + fourthInput + " " + fivethInput + " " + sixthInput;

        provideInput(input);
        SucetPostupnostCiselDoWhileTester.main(new String[0]);
        assertTrue(getOutput().contains(expectedResult));
    }

    /*
    @ParameterizedTest
    @CsvSource(value = {"50,50,1", "88,50,nie je deliteľné", "33,50,nie je deliteľné"})
    public void overCisloTest(String firstInput, String secondInput, String expectedResult) {
        final String input = firstInput + " " + secondInput;
        provideInput(input);

        NasobokCisla.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
    }
     */
}
