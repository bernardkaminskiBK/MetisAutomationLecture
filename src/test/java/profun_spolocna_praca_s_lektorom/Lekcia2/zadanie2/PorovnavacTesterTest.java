package profun_spolocna_praca_s_lektorom.Lekcia2.zadanie2;

import base.InputOutputStreamHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun_spolocna_praca_s_lektorom.Lekcia02.zadanie2.PorovnavacTester;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PorovnavacTesterTest extends InputOutputStreamHelper
{
    @ParameterizedTest
    @CsvSource(value = {"10, 5, 10 je vacsie ako 5", "4, 5, 4 je mensie ako 5", "3, 3, nacitane cisla su zhodne"})
    public void porovnavacTesterTest(String firstInput, String secondInput, String expectedResult) {
        final String input = firstInput + " " + secondInput;
        provideInput(input);

        PorovnavacTester.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
    }
}
