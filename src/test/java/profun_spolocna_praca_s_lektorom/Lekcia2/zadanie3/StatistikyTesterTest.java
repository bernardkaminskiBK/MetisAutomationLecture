package profun_spolocna_praca_s_lektorom.Lekcia2.zadanie3;

import base.InputOutputStreamHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun_spolocna_praca_s_lektorom.Lekcia02.zadanie3.StatistikyTester;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatistikyTesterTest extends InputOutputStreamHelper
{
    @ParameterizedTest
    @CsvSource(value = {"1, 2, 3, 6, 6, 2, 1, 3"})
    public void statistikyTesterTest(String firstInput, String secondInput, String thirdtInput, String expectedResult1,
                              String expectedResult2, String expectedResult3, String expectedResult4, String expectedResult5) {
        final String input = firstInput + " " + secondInput + " " + thirdtInput;
        provideInput(input);

        StatistikyTester.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult1) && getOutput().contains(expectedResult2) &&
                getOutput().contains(expectedResult3) && getOutput().contains(expectedResult4) &&
                getOutput().contains(expectedResult5));
    }
}
