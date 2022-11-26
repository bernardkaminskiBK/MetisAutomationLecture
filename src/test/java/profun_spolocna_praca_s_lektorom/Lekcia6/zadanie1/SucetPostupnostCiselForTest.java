package profun_spolocna_praca_s_lektorom.Lekcia6.zadanie1;

import base.InputOutputStreamHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun_spolocna_praca_s_lektorom.Lekcia06.zadanie1.SucetPostupnostCiselForTester;


import static org.junit.jupiter.api.Assertions.assertTrue;

class SucetPostupnostCiselForTest extends InputOutputStreamHelper {

    @ParameterizedTest
    @CsvSource(value = {"5, 5, 6, 9, 2, 7, 29"})
    public void sumWithDoWhileLoopTest(String firstInput, String secondInput, String thirdthInput, String fourthInput, String fivethInput, String sixthInput, String expectedResult) {
        String input = firstInput + " " + secondInput + " " + thirdthInput + " " + fourthInput + " " + fivethInput + " " + sixthInput;

        provideInput(input);
        SucetPostupnostCiselForTester.main(new String[0]);
        assertTrue(getOutput().contains(expectedResult));
    }
}
