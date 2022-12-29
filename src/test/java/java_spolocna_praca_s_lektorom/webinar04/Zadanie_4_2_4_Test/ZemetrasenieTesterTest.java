package java_spolocna_praca_s_lektorom.webinar04.Zadanie_4_2_4_Test;

import javazaklady.lecture4.activity2.Zadanie_4_2_4.Zemetrasenie;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class ZemetrasenieTesterTest {

    @ParameterizedTest
    @CsvSource(value = {"7.5, 2", "5.5,4", "-10, 0"})
    public void magnitudaTest(double magnituda, int expectedResult) {
        Zemetrasenie zemetrasenie = new Zemetrasenie(magnituda);

        String actualResult = zemetrasenie.getPopis();
        Assertions.assertTrue(actualResult.contains(getExpectedResult(expectedResult)));
    }

    private String getExpectedResult(int num) {
        return switch (num) {
            case 1 -> "Vacsina budov sa zruti";
            case 2 -> "Mnoho budov ma narusenu statiku";
            case 3 -> "Mnoho budov bolo znacne poskodenych, niektore sa dokonca zrutia";
            case 4 -> "Poskodene len budovy slabej konstrukcie";
            case 5 -> "Mnoho ludi ho pociti, ziadne poskodenie budov nebolo zaznamene";
            case 6 -> "Vo vseobecnosti nie je rozpoznatelne ludmi";
            default -> "Zaporne cisla nie su povolene";
        };
    }
}
