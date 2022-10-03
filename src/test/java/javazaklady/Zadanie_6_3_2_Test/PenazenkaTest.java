package javazaklady.Zadanie_6_3_2_Test;

import javazaklady.Webinar06.Zadanie_6_3_2.Penazenka;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.Normalizer;

class PenazenkaTest {

    @ParameterizedTest
    @CsvSource(value = {
            "Patdesiatcentovka, Dvojeurovka, Centovka, '[Patdesiatcentovka, Dvojeurovka, Centovka]'",
            "Dvojeurovka, Dvadsatcentovka, Patdesiatcentovka, '[Dvojeurovka, Dvadsatcentovka, Patdesiatcentovka]'",
            "Dvojeurovk, Patcentovka, Eurovka, '[Patcentovka, Eurovka]'",
    })
    public void pridajMincuTest(String minca1, String minca2, String minca3, String expectedResults) {
        Penazenka penazenka = new Penazenka();
        penazenka.pridajMincu(minca1);
        penazenka.pridajMincu(minca2);
        penazenka.pridajMincu(minca3);

        System.out.println(removeDiacriticalMarks(expectedResults));
        System.out.println(removeDiacriticalMarks(penazenka.toString()));

        Assertions.assertEquals(removeDiacriticalMarks(expectedResults), removeDiacriticalMarks(penazenka.toString()));
    }

    private static String removeDiacriticalMarks(String string) {
        return Normalizer.normalize(string, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "").toLowerCase();
    }

}
