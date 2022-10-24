package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_1;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class MnozinaDatTest
{
    @ParameterizedTest
    @CsvSource(value = {"1000,1000", "1200,1200", "2000,2000"})
    @DisplayName("AktualnyZostatok")
    void getAktualnyZostatokTest(double zostatok, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(zostatok);
        double actualResult = bankovyUcet.getAktualnyZostatok();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"1000,2000"})
    @DisplayName("minimum")
    void mnozinaGetMinimum(double aktualny1, double aktualny2)
    {
        BankovyUcet bankovyUcet1 = new BankovyUcet(aktualny1);
        BankovyUcet bankovyUcet2 = new BankovyUcet(aktualny2);
        MnozinaDat mnozinaDat = new MnozinaDat();
        mnozinaDat.pridajPrvok(bankovyUcet1);
        mnozinaDat.pridajPrvok(bankovyUcet2);
        assertEquals(1000, mnozinaDat.getMinimum().getAktualnyZostatok());
    }

    @ParameterizedTest
    @CsvSource(value = {"1000,2000"})
    @DisplayName("maximum")
    void mnozinaGetMaximum(double aktualny1, double aktualny2) {
        BankovyUcet bankovyUcet1 = new BankovyUcet(aktualny1);
        BankovyUcet bankovyUcet2 = new BankovyUcet(aktualny2);
        MnozinaDat mnozinaDat = new MnozinaDat();
        mnozinaDat.pridajPrvok(bankovyUcet1);
        mnozinaDat.pridajPrvok(bankovyUcet2);
        assertEquals(2000, mnozinaDat.getMaximum().getAktualnyZostatok());
    }


}

