package profun_spolocna_praca_s_lektorom.Lekcia8.zadanie2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun_spolocna_praca_s_lektorom.Lekcia08.zadanie2.OverPriestupnostRokaTester;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverPriestupnostRokaTesterTest
{
    @ParameterizedTest
    @CsvSource(value = {"2000, true", "2001, false"})
    public void overPriestupnostRokaTesterTest(int year, boolean expected)
    {
        boolean actual = OverPriestupnostRokaTester.jePrestupny(year);

        assertEquals(actual, expected);
    }
}
