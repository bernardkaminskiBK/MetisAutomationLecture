package java_spolocna_praca_s_lektorom.webinar12.Zadanie_12_2_2;

import java_spolocna_praca_s_lektorom.webinar12.zadanie_12_2_2.BankovyUcet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankomatTest {

    @ParameterizedTest
    @CsvSource(value = {"1000,1000", "2000,2000", "2500,2500"})
    void getAktualnyZostatokTest(double aktualnyZostatok, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktualnyZostatok);
        double actualResult = bankovyUcet.getAktualnyZostatok();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"1000,500,1500", "2000,300,2300", "3000,100,3100"})
    void vlozTest(double aktualnyZostatok, double ciastka, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktualnyZostatok);
        bankovyUcet.vloz(ciastka);
        double actualResult = bankovyUcet.getAktualnyZostatok();
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
