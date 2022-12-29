package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_3.b_Test;

import javazaklady.lecture9.activity2.Zadanie_9_2_3.part2.DvojrozmernyGrafickyUtvar;
import javazaklady.lecture9.activity2.Zadanie_9_2_3.part2.Obdlznik;
import javazaklady.lecture9.activity2.Zadanie_9_2_3.part2.Trojuholnik;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DvojrozmerneGrafickeUtvary2Test {

    @ParameterizedTest
    @CsvSource(value = {"20,20", "30,30", "40,40"})
    void getVyskaTest(double vyska, double expectedResult)
    {
        DvojrozmernyGrafickyUtvar utvar = new DvojrozmernyGrafickyUtvar(20, vyska);
        double actualyResult = utvar.getVyska();
        Assertions.assertEquals(expectedResult,actualyResult,"Should by: " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"20,20", "30,30", "40,40"})
    void getSirkaTest(double sirka, double expectedResult)
    {
        DvojrozmernyGrafickyUtvar utvar = new DvojrozmernyGrafickyUtvar(sirka, 20);
        double actualyResult = utvar.getSirka();
        Assertions.assertEquals(expectedResult,actualyResult,"Should by: " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"20,50,1000", "30,50,1500", "30,30,900"})
    void obdlznikGetPlochaTest(double sirka, double vyska, double expectedResult)
    {
        Obdlznik utvarObdlznik = new Obdlznik(sirka, vyska);
        double actualResult = utvarObdlznik.plocha();
        Assertions.assertEquals(expectedResult,actualResult, "Area should be: " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"50,30,750", "20,50,500", "30,30,450"})
    void trojuholnikPlochaTest(int sirka, int vyska, double expectedResult)
    {
        Trojuholnik trojuholnik = new Trojuholnik(sirka, vyska);
        double actualResult = trojuholnik.plocha();
        Assertions.assertEquals(expectedResult, actualResult, "Area should be: " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"vyplnený,vyplnený", "nevyplnený, nevyplnený", "polovyplnený,polovyplnený"})
    void trojuholnikStylTest(String styl, String expectedResult)
    {
        Trojuholnik utvar = new Trojuholnik(20,20);
        String actualResult = utvar.styl = styl;
        Assertions.assertEquals(expectedResult,actualResult);
    }
}

