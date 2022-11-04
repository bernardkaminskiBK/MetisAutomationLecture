package java_spolocna_praca_s_lektorom.webinar18.Zadanie_18_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.*;

public class ProduktKatalogTest {

    @ParameterizedTest
    @CsvSource(value = {"Peterson,Peterson", "Jacobs,Jacobs", "Magnus,Magnus"})
    void getNazovTest(String nazov, String expectedResult) {
        Dodavatel dodavatel = new Dodavatel(nazov);
        String actualResult = dodavatel.getNazov();
        assertThat(actualResult).matches(expectedResult);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
