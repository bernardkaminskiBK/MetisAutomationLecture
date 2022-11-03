package java_spolocna_praca_s_lektorom.webinar12.Zadanie_12_2_1;

import java_spolocna_praca_s_lektorom.webinar12.zadanie_12_2_1.Adresa;
import java_spolocna_praca_s_lektorom.webinar12.zadanie_12_2_1.Faktura;
import java_spolocna_praca_s_lektorom.webinar12.zadanie_12_2_1.Produkt;
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

    /**
     *
     * Treba ešte dorobiť !!!
     */
    @ParameterizedTest
    @CsvSource(value = {"Hriankovac,12.2", "Radio,120.7", "Satelit,78.8"})
    void fakturaTest(String nazov, double cena)
    {
        Adresa adresa = new Adresa("Firma XYZ", "Horna 5", "12345", "Horna Dolan");
        Faktura faktura = new Faktura(adresa);
        faktura.pridaj(new Produkt(nazov,cena), 10);
        System.out.println(faktura.naformatuj());
    }

}
