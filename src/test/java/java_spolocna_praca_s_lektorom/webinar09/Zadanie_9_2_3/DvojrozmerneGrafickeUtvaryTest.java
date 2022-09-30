package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DvojrozmerneGrafickeUtvaryTest {

    @ParameterizedTest
    @CsvSource(value = {"20,30,'sirka = 20, vyska = 30'"})
    void dvojrozmernyGrafickyUtvarTest(int sirka, int vyska, String expectedResult)
    {
        DvojrozmernyGrafickyUtvar utvar = new DvojrozmernyGrafickyUtvar();
        utvar.sirka = sirka;
        utvar.vyska = vyska;
        String actualResult = "sirka = " + sirka + ", vyska = " + vyska;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"20,50,1000", "30,50,1500", "30,30,900"})
    void obdlznikTest(int sirka, int vyska, double expectedREsult)
    {
        Obdlznik obdlznik = new Obdlznik();
        obdlznik.sirka = sirka;
        obdlznik.vyska = vyska;
        double actualResultArea = obdlznik.plocha();
        Assertions.assertEquals(expectedREsult,actualResultArea,"Area should be: " + expectedREsult);

    }

    @ParameterizedTest
    @CsvSource(value = {"20,20", "40,40", "1,1"})
    void jeStvorec(int sirka, int vyska)
    {
        Obdlznik obdlznik = new Obdlznik();
        obdlznik.sirka = sirka;
        obdlznik.vyska = vyska;
        Assertions.assertTrue(obdlznik.jeStvorec());
    }

    @ParameterizedTest
    @CsvSource(value = {"50,30,750", "20,50,500", "30,30,450"})
    void trojuholnikTest(int sirka, int vyska, double expectedResult)
    {
        Trojuholnik utvar3 = new Trojuholnik();
        utvar3.sirka = sirka;
        utvar3.vyska = vyska;
        double assertResultArea = utvar3.plocha();
        Assertions.assertEquals(expectedResult,assertResultArea);

    }

    @ParameterizedTest
    @CsvSource(value = {"vyplnený,vyplnený", "nevyplnený, nevyplnený", "polovyplnený,polovyplnený"})
    void trojuholnikStylTest(String styl, String expectedResult)
    {
        Trojuholnik utvar3 = new Trojuholnik();
        String actualResult = utvar3.styl = styl;
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
