package java_spolocna_praca_s_lektorom.webinar11.Zadanie_11_2_1;

import javazaklady.lecture11.activity2.Zadanie_11_2_1.CitacMnozinyDat;
import javazaklady.lecture11.activity2.Zadanie_11_2_1.VlastnaVynimka;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;


class CitacMnozinyDatTest {

    @ParameterizedTest
    @CsvSource(value = {"data.txt", "data2.txt", "data3.txt"})
    void readFile(String filepath)
    {
        File file = new File(filepath);
        assertTrue(file.exists());
    }
    
    @ParameterizedTest
    @CsvSource(value = {"121.65,data.txt", "120.65,data2.txt", "130,data3.txt"})
    void citajSuborTest(double expectedResult, String filepath) throws IOException, VlastnaVynimka {
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

    @Test
    void throwIOException()
    {
        Throwable actualResult = assertThrows(IOException.class, () -> {
            throw new IOException("Nastala vstupno/vystupna chyba!");
        });
        assertEquals("Nastala vstupno/vystupna chyba!", actualResult.getMessage());

    }

    @ParameterizedTest
    @CsvSource(value = {"Ocakavany parameter - velkost mnoziny dat", "Ocakavame koniec suboru",
            "Ocakavame desatinne cislo"})
    void nespravnyFormatDatException(String sprava)
    {
        Throwable actualResult = assertThrows(VlastnaVynimka.class, () -> {
            throw new VlastnaVynimka(sprava);
        });
        assertEquals(sprava, actualResult.getMessage());
    }

}