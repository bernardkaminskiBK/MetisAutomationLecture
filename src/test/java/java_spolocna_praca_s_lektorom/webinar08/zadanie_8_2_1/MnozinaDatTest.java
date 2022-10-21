package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MnozinaDatTest
{
    @ParameterizedTest
    @CsvSource(value = {"1000,1000", "1200,1200", "2000,2000"})
    void getAktualnyZostatokTest(double zostatok, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(zostatok);
        double actualResult = bankovyUcet.getAktualnyZostatok();
        Assertions.assertEquals(expectedResult,actualResult);
    }
}

