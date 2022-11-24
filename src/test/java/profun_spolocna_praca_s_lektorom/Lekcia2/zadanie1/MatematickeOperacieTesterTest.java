package profun_spolocna_praca_s_lektorom.Lekcia2.zadanie1;

import base.InputOutputStreamHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun_spolocna_praca_s_lektorom.Lekcia02.zadanie1.MatematickeOperacieTester;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatematickeOperacieTesterTest extends InputOutputStreamHelper
{
    @ParameterizedTest
    @CsvSource(value = {"20, 5, 25, 100, 15, 4, 0", "10, 2, 12, 20, 8, 5, 0"})
    public void matematickeOpercieTesterTest(String firstInput, String secondInput, String expectedResult1,
                                             String expectedResult2, String expectedResult3, String expectedResult4,
                                             String expectedResult5) {
        final String input = firstInput + " " + secondInput;

        provideInput(input);

        MatematickeOperacieTester.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult1) && getOutput().contains(expectedResult2) &&
                getOutput().contains(expectedResult3) && getOutput().contains(expectedResult4) &&
                getOutput().contains(expectedResult5));
    }
}
