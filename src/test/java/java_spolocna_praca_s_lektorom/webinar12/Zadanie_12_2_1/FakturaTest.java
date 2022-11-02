package java_spolocna_praca_s_lektorom.webinar12.Zadanie_12_2_1;

import java_spolocna_praca_s_lektorom.webinar12.zadanie_12_2_1.Adresa;
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

}
