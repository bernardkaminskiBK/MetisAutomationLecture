package javazaklady.Zadanie_6_3_3_Test;


import javazaklady.Zadanie_6_3_3.Penazenka;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class PenazenkaTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Patdesiatcentovka, Dvojeurovka, Centovka, '[Patdesiatcentovka, Dvojeurovka, Centovka]'",
            "Dvojeurovka, Dvadsatcentovka, Patdesiatcentovka, '[Dvojeurovka, Dvadsatcentovka, Patdesiatcentovka]'",
            "Dvojeurovka, Patcentovka, Eurovka, '[Dvojeurovka, Patcentovka, Eurovka]'"
    })
    public void pridajMincuTest(String minca1, String minca2, String minca3, String expectedResults) {
        Penazenka penazenka = new Penazenka();
        penazenka.pridajMincu(minca1);
        penazenka.pridajMincu(minca2);
        penazenka.pridajMincu(minca3);

        System.out.println(penazenka.toString());
        System.out.println(expectedResults);

        Assertions.assertEquals(expectedResults, penazenka.toString());

    }

}
