package profun_spolocna_praca_s_lektorom.Lekcia6.zadanie2;

import base.InputOutputStreamHelper;
import org.junit.jupiter.api.Test;
import profun_spolocna_praca_s_lektorom.Lekcia06.zadanie2.VypocitajPriemerTester;
import utils.StorePrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class VypocitajPriemerTest extends InputOutputStreamHelper {

    @Test
    public void vypocitajPriemerTest() {
        System.setOut(new StorePrintStream(System.out));

        String input = "5" + " " + "10" + " " + "15" + " " + "9999" + " " + "10";
        provideInput(input);

        VypocitajPriemerTester.main(new String[0]);

        assertTrue(getOutput().contains("10"));

        //System.out.println("\n\nactual result print: " + StorePrintStream.printlnList);
        //System.out.println("actual result printf: " + StorePrintStream.printfList);
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
