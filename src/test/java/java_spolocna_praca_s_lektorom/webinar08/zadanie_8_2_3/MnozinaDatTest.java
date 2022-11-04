package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class MnozinaDatTest
{
    @ParameterizedTest
    @CsvSource(value = {"1000,1000", "2000,2000", "3000,3000"})
    void getMieraTest(double aktual, double expected)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktual);
        double actualResult = bankovyUcet.getMiera();
        Assertions.assertEquals(expected,actualResult);
    }
}


