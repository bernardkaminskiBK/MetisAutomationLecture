package Zadanie_8_3_2_Test;

import Zadanie_8_3_2.Mocnina;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MocninaTest {

    @ParameterizedTest
    @CsvSource({"5,3,125", "3,4,81", "5,5,3125"})
    public void vypocitaj(int cislo, int exponent, int ocakavanyVysledok) {
        int aktualnaHodnota = Mocnina.umocni(cislo, exponent);

        Assertions.assertEquals(ocakavanyVysledok, aktualnaHodnota);
    }

    @ParameterizedTest
    @CsvSource(value = {"5,5", "2,2"})
    public void vstupTest() {
        
    }
}
