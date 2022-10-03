package java_spolocna_praca_s_lektorom.webinar11.Zadanie_11_2_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;


class CitacMnozinyDatTest {

    @Test
    void readFile()
    {
        File file = new File("data.txt");
        assertTrue(file.exists());
    }
    
    @ParameterizedTest
    @CsvSource(value = {"121.65,data.txt", "120.65,data2.txt", "130,data3.txt"})
    void citajSuborTest(double expectedResult, String filepath) throws IOException, NespravnyFormatDat {
        CitacMnozinyDat citac = new CitacMnozinyDat();
        citac.citajSubor(filepath);
        double[] data = citac.citajSubor(filepath);
        double sucet = 0;

        for (double cislo : data)
        {
            sucet += cislo;
        }
        double actualResult = sucet;
        assertEquals(expectedResult,actualResult);

    }

}