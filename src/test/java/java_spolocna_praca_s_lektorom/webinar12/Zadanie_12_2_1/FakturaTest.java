package java_spolocna_praca_s_lektorom.webinar12.Zadanie_12_2_1;

import javazaklady.lecture12.activity2.Zadanie_12_2_1.Adresa;
import javazaklady.lecture12.activity2.Zadanie_12_2_1.Produkt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FakturaTest {

    @ParameterizedTest
    @CsvSource(value = {"Firma Libra, Prievozská 34, 812 05, Bratislava"})
    void adresaTest(String nazov, String ulica, String psc, String mesto)
    {
        Adresa adresa = new Adresa(nazov, ulica, psc, mesto);
        String actualResult = adresa.naformatuj();
        String expectedResult = """
                Firma Libra
                Prievozská 34
                812 05 Bratislava""";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Hriankovac,12,Hriankovac", "Radio,120,Radio", "Satelit,78,Satelit"})
    void produktGetNazovTest(String nazov, double cena, String expectedResult)
    {
        Produkt produkt = new Produkt(nazov, cena);
        String actualResult = produkt.getNazov();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Hriankovac,12.2,12.2", "Radio,120.7,120.7", "Satelit,78.8,78.8"})
    void produktGetCenaTest(String nazov, double cena, double expectedResult)
    {
        Produkt produkt = new Produkt(nazov, cena);
        double actualResult = produkt.getCena();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Hriankovac,12.5,3,37.5", "Radio,120,6,720.0", "Satelit,78.5,9,706.5"})
    void getCelkovaCenaTest(String nazov, double cena, int mnozstvo, double expectedResult)
    {
        Produkt produkt = new Produkt(nazov, cena);
        double actualResult = produkt.getCena() * mnozstvo;
        Assertions.assertEquals(expectedResult,actualResult);
    }

}
