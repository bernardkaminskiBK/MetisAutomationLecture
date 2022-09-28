package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_3;
import java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_3.volanie_hodnotou_a_odkazom.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankovyUcetJUnit5Test {


    @ParameterizedTest
    @CsvSource(value = {"2000,2000", "1500,1500", "1000,1000"})
    void getAktualnyZostatokTest(double aktualZostatok, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktualZostatok);
        double actualResult = bankovyUcet.getAktualnyZostatok();
        assertEquals(expectedResult,actualResult, "current bank account balance should be: " + expectedResult);
    }


    @ParameterizedTest
    @CsvSource(value = {"2000,1000,500,1500", "1000,500,500,1000", "1500,300,500,800"})
    void prevodHodnotouTest(double aktualnyZostatok, double ciastka, double zostatokNaInomUcte, double expectedResult)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktualnyZostatok);
        double actualResult = bankovyUcet.preved(ciastka, zostatokNaInomUcte);
        assertEquals(expectedResult,actualResult,"The balance on another account should be " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"2000,1000,500,1500", "1000,500,500,1000", "1500,300,500,800"})
    void prevodOdkazomTest(double aktualnyZostatok1, double ciastka, double aktualnyZostatok2, double expectedResult)
    {
        BankovyUcet bankovyUcet1 = new BankovyUcet(aktualnyZostatok1);
        BankovyUcet bankovyUcet2 = new BankovyUcet(aktualnyZostatok2);
        double actualResult = bankovyUcet1.prevod(ciastka, bankovyUcet2);
        assertEquals(expectedResult,actualResult, "The balance on another account should be " + expectedResult);
    }





}
