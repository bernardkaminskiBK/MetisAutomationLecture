package javazaklady2.Webinar04_Test.part3;

import javazaklady.lecture4.activity3.part3.MnozinaDat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MnozinaDatTest {

    @ParameterizedTest
    @CsvSource(value = {"2,5,1,1","20,55,1052,20","88,5,999,5"})
    public void getNajmensieTest(double cislo1, double cislo2, double cislo3, double expectedResult){

        MnozinaDat mnozina = new MnozinaDat(cislo1, cislo2, cislo3);

        Assertions.assertEquals(expectedResult,mnozina.getNajmensie());
    }

    @ParameterizedTest
    @CsvSource(value = {"2,5,1,2","20,55,1052,55","88,5,999,88"})
    public void getProstredneTest(double cislo1, double cislo2, double cislo3, double expectedResult){

        MnozinaDat mnozina = new MnozinaDat(cislo1, cislo2, cislo3);

        Assertions.assertEquals(expectedResult,mnozina.getProstredne());
    }

    @ParameterizedTest
    @CsvSource(value = {"2,5,1,5","20,55,1052,1052","88,5,999,999"})
    public void getNajvacsieTest(double cislo1, double cislo2, double cislo3, double expectedResult){

        MnozinaDat mnozina = new MnozinaDat(cislo1, cislo2, cislo3);

        Assertions.assertEquals(expectedResult,mnozina.getNajvacsie());
    }
}
