package profun_spolocna_praca_s_lektorom.Lekcia6.zadanie3;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Test;
import profun_spolocna_praca_s_lektorom.Lekcia06.zadanie3.StatistikyTester;
import utils.StorePrintStream;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StatistikyTest extends InputOutputStreamHelper {

    /*
        zadaj velkost mnoziny dat ako kladne cele cislo: 5
        zadaj 1. cislo: 1
        zadaj 2. cislo: 2
        zadaj 3. cislo: 3
        zadaj 4. cislo: 4
        zadaj 5. cislo: 5

        sucet cisel je: 15
        minimum je: 1
        maximum je: 5
        maximum v absolutnej hodnote je: 5
     */

    @Test
    public void generujStatistikyTest() {

        String input = "5" + " " + "1" + " " + "2" + " " + "3" + " " + "4" + " " + "5";
        provideInput(input);

        StatistikyTester.main(new String[0]);

        assertTrue(getOutput().contains("\nsucet cisel je: " + "15" + "\n" + "minimum je: " + "1" + "\n"  + "maximum je: " + "5" + "\n" + "maximum v absolutnej hodnote je: " + "5"));
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

