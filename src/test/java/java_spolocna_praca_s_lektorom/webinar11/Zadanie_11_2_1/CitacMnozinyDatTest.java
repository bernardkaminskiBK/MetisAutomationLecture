package java_spolocna_praca_s_lektorom.webinar11.Zadanie_11_2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;

class CitacMnozinyDatTest {

    private AnalyzatorDat analyzatorDat;

    @BeforeEach
    public void setUp()
    {
        analyzatorDat = new AnalyzatorDat();
    }

    @ParameterizedTest
    @CsvSource()
    void citacTest(double expectedResult) throws IOException, NespravnyFormatDat {
        CitacMnozinyDat citac = new CitacMnozinyDat();
        double[] actual = citac.citajSubor("src/main/java/java_spolocna_praca_s_lektorom/" +
                "webinar11/Zadanie_11_2_4/statistiky.txt");
        Assertions.assertEquals(expectedResult,actual);
    }
}