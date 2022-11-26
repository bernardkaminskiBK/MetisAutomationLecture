package profun_spolocna_praca_s_lektorom.Lekcia8.zadanie1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun_spolocna_praca_s_lektorom.Lekcia08.zadanie1.OverNerovnostTester;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OverNerovnostTesterTest
{
    @ParameterizedTest
    @CsvSource(value = {"2, 3, 4, trojuholnik je mozne zostrojit", "1, 2, 3, trojuholnik nie je mozne zostrojit"})
    public void overNerovnostTesterTest(int firstInput, int secondInput, int thirdtInput, String expected)
    {
        String actual = OverNerovnostTester.overTrojNerovnost(firstInput, secondInput, thirdtInput);

        assertTrue(actual.contains(expected));
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 3, 4, trojuholnik je mozne zostrojit", "1, 2, 3, trojuholnik nie je mozne zostrojit"})
    public void overNerovnostTester2Test(int firstInput, int secondInput, int thirdtInput, String expected)
    {
        String actual = OverNerovnostTester.overTrojNerovnost2(firstInput, secondInput, thirdtInput);

        assertTrue(actual.contains(expected));
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 3, 4, trojuholnik je mozne zostrojit", "1, 2, 3, trojuholnik nie je mozne zostrojit"})
    public void overNerovnostTester3Test(int firstInput, int secondInput, int thirdtInput, String expected)
    {
        String actual = OverNerovnostTester.overTrojNerovnost3(firstInput, secondInput, thirdtInput);

        assertTrue(actual.contains(expected));
    }

    @ParameterizedTest
    @CsvSource(value = {"2, 3, 4, trojuholnik je mozne zostrojit", "1, 2, 3, trojuholnik nie je mozne zostrojit"})
    public void overNerovnostTester4Test(int firstInput, int secondInput, int thirdtInput, String expected)
    {
        String actual = OverNerovnostTester.overTrojNerovnost4(firstInput, secondInput, thirdtInput);

        assertTrue(actual.contains(expected));
    }
}
