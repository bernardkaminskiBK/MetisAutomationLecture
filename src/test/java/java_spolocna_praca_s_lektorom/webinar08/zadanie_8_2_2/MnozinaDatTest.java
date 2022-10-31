package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MnozinaDatTest
{

    @ParameterizedTest
    @CsvSource(value = {"Desatcentovka,0.1,Desatcentovka", "Dvadsatcentovka,0.2,Dvadsatcentovka",
    "Eurovka,1.0,Eurovka"})
    void mincaGetNazovTest(String nazov, double hodnota, String expectedResult)
    {
        Minca minca = new Minca(nazov, hodnota);
        String actualResult = minca.getNazov();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Desatcentovka,0.1,0.1", "Dvadsatcentovka,0.2,0.2",
            "Eurovka,1.0,1.0"})
    void mincaGetHodnotaTest(String nazov, double hodnota, double expectedResult)
    {
        Minca minca = new Minca(nazov, hodnota);
        double actualResult = minca.getHodnota();
        Assertions.assertEquals(expectedResult,actualResult);
    }

}
