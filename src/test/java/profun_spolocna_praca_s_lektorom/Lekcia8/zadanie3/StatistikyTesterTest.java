package profun_spolocna_praca_s_lektorom.Lekcia8.zadanie3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun_spolocna_praca_s_lektorom.Lekcia08.zadanie3.StatistikyTester;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatistikyTesterTest
{
    @ParameterizedTest
    @CsvSource(value = {"10, 2, 12, 8, 5, 20", "9, 3, 12, 6, 3, 27", "18, 6, 24, 12, 3, 108"})
    public void statistikyTesterTest(double firstInput, double secondInput, double expected1, double expected2,
                                     double expected3, double expected4)
    {
        double actual1 = StatistikyTester.vypocitajSucet(firstInput, secondInput);
        double actual2 = StatistikyTester.vypocitajRozdiel(firstInput, secondInput);
        double actual3 = StatistikyTester.vypocitajPodiel(firstInput, secondInput);
        double actual4 = StatistikyTester.vypocitajSucin(firstInput, secondInput);

        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
        assertEquals(actual3, expected3);
        assertEquals(actual4, expected4);
    }
}
