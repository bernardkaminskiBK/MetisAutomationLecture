package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_1;

import java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_1.bankove_ucty.BankovyUcet;
import static org.junit.jupiter.api.Assertions.*;

import java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_1.bankove_ucty.BeznyUcet;
import java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_1.bankove_ucty.SporiaciUcet;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankovyUcetJunit5Test {


    @ParameterizedTest
    @CsvSource(value = {"2000,2000", "1500,1500", "1000,1000"})
    void getAktualnyZostatokTest(double aktualnyZostatok, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktualnyZostatok);
        double actualResult = bankovyUcet.getAktualnyZostatok();
        assertEquals(expectedResult,actualResult,"current bank account balance should be: " + expectedResult);
    }


    @ParameterizedTest
    @CsvSource(value = {"1000,300,1300", "2300,400,2700", "700,500,1200"})
    void vlozTest(double aktualnyZostatok, double ciastka, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktualnyZostatok);
        bankovyUcet.vloz(ciastka);
        double aktualResult = bankovyUcet.getAktualnyZostatok();
        assertEquals(expectedResult, aktualResult, "current bank account balance should be: " + expectedResult);
    }


    @ParameterizedTest
    @CsvSource(value = {"1000,300,700", "2300,400,1900", "700,500,200"})
    void vyberTest(double aktualnyZostatok, double ciastka, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktualnyZostatok);
        bankovyUcet.vyber(ciastka);
        double aktualResult = bankovyUcet.getAktualnyZostatok();
        assertEquals(expectedResult, aktualResult, "current bank account balance should be: " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"1000,998"})
    void zauctujPoplatkyTest(double pociatocnyZostatok, double expectedResult)
    {
        BeznyUcet beznyUcet = new BeznyUcet(pociatocnyZostatok);
        beznyUcet.zauctujPoplatky();
        double actualResult = beznyUcet.getAktualnyZostatok();
        assertEquals(expectedResult,actualResult,
                "the balance on the current bank account after fees should be" + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"1000,2,1020", "500,3,515", "2000,5,2100"})
    void pripisUrokTest(double pociatocnyZostatok, double urokovaSadzba, double expectedResult)
    {
        SporiaciUcet sporiaciUcet = new SporiaciUcet(pociatocnyZostatok, urokovaSadzba);
        sporiaciUcet.pripisUrok();
        double actualResult = sporiaciUcet.getAktualnyZostatok();
        assertEquals(expectedResult, actualResult,
                "the current balance in the bank account after adding interest should be" + expectedResult);
    }






}
