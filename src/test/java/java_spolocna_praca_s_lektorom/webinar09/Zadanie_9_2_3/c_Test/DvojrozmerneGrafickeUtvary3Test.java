package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3.c_Test;

import java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3.c.DvojrozmernyGrafickyUtvar;
import java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3.c.Obdlznik;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DvojrozmerneGrafickeUtvary3Test {

    @ParameterizedTest
    @CsvSource(value = {"20,30,'sirka = 20, vyska = 30'", "40,30,'sirka = 40, vyska = 30'", "50,50,'sirka = 50, vyska = 50'"})
    void dvojrozmernyGrafickyUtvarTest(int sirka, int vyska, String expectedResult)
    {
        DvojrozmernyGrafickyUtvar utvar = new DvojrozmernyGrafickyUtvar(sirka,vyska);
        utvar.sirka = sirka;
        utvar.vyska = vyska;
        String actualResult = "sirka = " + sirka + ", vyska = " + vyska;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"20,50,1000", "30,50,1500", "30,30,900"})
    void obdlznikTest(double sirka, double vyska, double expectedREsult)
    {
        Obdlznik obdlznik = new Obdlznik(sirka,vyska);
        obdlznik.sirka = sirka;
        obdlznik.vyska = vyska;
        double actualResultArea = obdlznik.plocha();
        Assertions.assertEquals(expectedREsult,actualResultArea,"Area should be: " + expectedREsult);
    }

    @ParameterizedTest
    @CsvSource(value = {"20,20", "40,40", "1,1"})
    void jeStvorec(int sirka, int vyska)
    {
        Obdlznik obdlznik = new Obdlznik(sirka,vyska);
        obdlznik.sirka = sirka;
        obdlznik.vyska = vyska;
        Assertions.assertTrue(obdlznik.jeStvorec());
    }

}
