package profun_spolocna_praca_s_lektorom.Lekcia4.zadanie3;

import base.InputOutputStreamHelper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia02.a.NasobokCisla;
import profun_spolocna_praca_s_lektorom.Lekcia04.zadanie3.OdmenaTester;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OdmenaTesterTest extends InputOutputStreamHelper
{
    @ParameterizedTest
    @CsvSource(value = {"8000, 920, -1"})
    public void odmenaTesterTest(String firstInput, String expectedResult, String secondInput) {
        final String input = firstInput + " " + secondInput;
        provideInput(input);

        OdmenaTester.main(new String[0]);

        assertTrue(getOutput().contains(expectedResult));
    }
}