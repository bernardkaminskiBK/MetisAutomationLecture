package Zadanie_8_3_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParkovneTest {

    @ParameterizedTest()
    @CsvSource(value = {"1.5,2.00", "4.0,2.50", "24.0,10.00", "3.0,2.00", "6.00,3.50"})
    public void spocitajPoplatkyTest(double hodiny, double ocakavanaHodnota) {
//        double aktualnaHodnota = sk.itvkurze.antoska.zadanie_8_3_1.Parkovne.vypocitajPoplatky(hodiny);
//        double aktualnaHodnota = sk.itvkurze.hubay.zadanie_8_3_1.Parkovanie.spocitajPoplatky(hodiny);
        double aktualnaHodnota = sk.itvkurze.mesko.zadanie_8_3_1.Parkovne.spocitajPoplatky(hodiny);
        Assertions.assertEquals(ocakavanaHodnota, aktualnaHodnota);
    }

}
