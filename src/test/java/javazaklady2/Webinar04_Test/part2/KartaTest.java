package javazaklady2.Webinar04_Test.part2;


import javazaklady2.Webinar04.part2.Karta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.Normalizer;

public class KartaTest {

    @ParameterizedTest
    @CsvSource(value = {"4Z,Štvorka Zelená/e/ý","20M,Neznáma karta","5Č,Päťka Červená/e/ý"})
    public void getRiesenie2Test(String skratka, String expectedResult){

        Karta karta = new Karta(skratka);

        Assertions.assertEquals(removeDiacriticalMarks(expectedResult).toLowerCase(),removeDiacriticalMarks(karta.getPopis().toLowerCase()));
    }

    public static String removeDiacriticalMarks(String string) {
        return Normalizer.normalize(string, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
