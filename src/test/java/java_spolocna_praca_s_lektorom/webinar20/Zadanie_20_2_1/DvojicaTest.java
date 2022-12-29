package java_spolocna_praca_s_lektorom.webinar20.Zadanie_20_2_1;

import javazaklady.lecture20.activity2.Zadanie_20_2_1.Dvojica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DvojicaTest {

    @ParameterizedTest
    @CsvSource(value = {"Juraj,123,Juraj", "Peter,1290,Peter", "Martin,222,Martin"})
    void getPrvyTest(String nazov1, Integer cislo,String expectedResult)
    {
        Dvojica<String, Integer> dvojica = new Dvojica<>(nazov1, cislo);
        String actualResult = dvojica.getPrvy();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Juraj,123,123", "Peter,1290,1290", "Martin,222,222"})
    void getDruhyTest(String nazov1, Integer cislo,Integer expectedResult)
    {
        Dvojica<String, Integer> dvojica = new Dvojica<>(nazov1, cislo);
        Integer actualResult = dvojica.getDruhy();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"120#Peter#1.2#Juraj#Peter"},delimiter = '#')
    void haluztest(Integer prvy, String druhy, Double doubleHodnota, String nazovSuboru, String expectedResult)
    {
        Dvojica<Integer, String> cisloText = new Dvojica<>(prvy,druhy);
        Dvojica<Double, String> cislo2Text = new Dvojica<>(doubleHodnota, nazovSuboru);
        Dvojica<Dvojica<Integer, String>, Dvojica<Double,String>> haluz = new Dvojica<>(cisloText,cislo2Text);

        String actualResult = (haluz.getPrvy().getDruhy());
        Assertions.assertEquals(expectedResult,actualResult);
    }


}