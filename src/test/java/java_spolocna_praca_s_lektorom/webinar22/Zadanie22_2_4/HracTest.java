package java_spolocna_praca_s_lektorom.webinar22.Zadanie22_2_4;

import java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_4.Hrac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class HracTest {
    @ParameterizedTest
    @CsvSource(value = {"Juraj,Jánošík,10,Juraj", "Ištván,Ferencvároš,18,Ištván","Monika,Chochlíková,20,Monika","Tomáš,Tadlánek,25,Tomáš"})
    void hracGetMenoTest(String meno, String priezvisko, int pocetGolov, String expectedResult)
    {
        Hrac hrac = new Hrac(meno, priezvisko,pocetGolov);
        String actualResult = hrac.getMeno();
        assertEquals(actualResult,expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Juraj,Jánošík,10,Jánošík", "Ištván,Ferencvároš,18,Ferencvároš","Monika,Chochlíková,20,Chochlíková","Tomáš,Tadlánek,25,Tadlánek"})
    void hracPriezviskoTest(String meno, String priezvisko, int pocetGolov, String expectedResult)
    {
        Hrac hrac = new Hrac(meno, priezvisko,pocetGolov);
        String actualResult = hrac.getPriezvisko();
        assertEquals(actualResult,expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Juraj,Jánošík,10,10", "Ištván,Ferencvároš,18,18","Monika,Chochlíková,20,20","Tomáš,Tadlánek,25,25"})
    void hracGetPocetGolovTest(String meno, String priezvisko, int pocetGolov, int expectedResult)
    {
        Hrac hrac = new Hrac(meno, priezvisko,pocetGolov);
        int actualResult = hrac.getPocetGolov();
        assertEquals(actualResult,expectedResult);
    }


}
