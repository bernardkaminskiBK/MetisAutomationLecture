package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_1;

import javazaklady.lecture18.activity2.Zadanie_18_2_1.Dodavatel;
import javazaklady.lecture18.activity2.Zadanie_18_2_1.ProduktovyKatalog;
import javazaklady.lecture18.activity2.Zadanie_18_2_1.Vyrobok;
import javazaklady.lecture18.activity2.Zadanie_18_2_1.ZotriedenyProduktovyKatalog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static javazaklady.lecture18.activity2.Zadanie_18_2_1.Sklad.*;


import static org.assertj.core.api.Assertions.*;

public class ProduktKatalogTest {

    @ParameterizedTest
    @CsvSource(value = {"Peterson,Peterson", "Jacobs,Jacobs", "Magnus,Magnus"})
    void getNazovDodavatelTest(String nazov, String expectedResult) {
        Dodavatel dodavatel = new Dodavatel(nazov);
        String actualResult = dodavatel.getNazov();
        assertThat(actualResult).matches(expectedResult);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Rádio,2,Rádio", "Jacobs,1,Jacobs", "TV,5,TV"})
    void getNazovVyrobokTest(String nazov, double vaha, String expectedResult) {
        Vyrobok vyrobok = new Vyrobok(nazov, vaha);
        String actualResult = vyrobok.getNazov();
        assertThat(actualResult).matches(expectedResult);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Rádio,2,2", "Jacobs,1,1", "TV,5,5"})
    void getVahaVyrobokTest(String nazov, double vaha, double expectedResult) {
        Vyrobok vyrobok = new Vyrobok(nazov, vaha);
        double actualResult = vyrobok.getVaha();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void prvkyTest()
    {
        ProduktovyKatalog produktovyKatalog = new ProduktovyKatalog();
        produktovyKatalog.pridajVyrobkyOd(fero);
        assertThat(produktovyKatalog).contains(dvere);
    }

    @Test
    void LahkePrvkyTest()
    {
        ZotriedenyProduktovyKatalog produktovyKatalog = new ZotriedenyProduktovyKatalog();
        produktovyKatalog.pridajVyrobkyOd(fero);
        produktovyKatalog.pridajVyrobkyOd(karol);
        assertThat(produktovyKatalog.getLahkeVyrobky()).contains(okno);

    }
}
