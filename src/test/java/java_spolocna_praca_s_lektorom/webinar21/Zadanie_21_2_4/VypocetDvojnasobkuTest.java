package java_spolocna_praca_s_lektorom.webinar21.Zadanie_21_2_4;

import java_spolocna_praca_s_lektorom.webinar21.zadanie_21_2_4.VypocetDvojnasobkuTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.StorePrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class VypocetDvojnasobkuTest {

    @Test
    void zrealizujVypocet()
    {
        System.setOut(new StorePrintStream(System.out));
        VypocetDvojnasobkuTester.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("Vysledok: 22"));
        assertEquals(3,StorePrintStream.printlnList.size());
    }

    @ParameterizedTest
    @CsvSource(value = {"2,8", "4,16", "3,12"})
    void zrealizujStaticVypocet(int actualNumber, int expectedResult)
    {
       VypocetDvojnasobkuRozhranie vypocitaj = (int cislo) -> cislo * 4;
       int actualResult = vypocitaj.zdvojnasob(actualNumber);
       assertEquals(expectedResult,actualResult);
    }

    @FunctionalInterface
    interface VypocetDvojnasobkuRozhranie
    {
        int zdvojnasob(int cislo);
    }
}
