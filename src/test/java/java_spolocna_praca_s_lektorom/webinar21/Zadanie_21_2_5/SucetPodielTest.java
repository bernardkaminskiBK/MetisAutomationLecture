package java_spolocna_praca_s_lektorom.webinar21.Zadanie_21_2_5;

import java_spolocna_praca_s_lektorom.webinar21.zadanie_21_2_5.SucetPodielTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.StorePrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class SucetPodielTest {

    @Test
    void sucetPodielConsoleTest()
    {
        System.setOut(new StorePrintStream(System.out));
        SucetPodielTester.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("Sucet: 30"));
        assertEquals(2,StorePrintStream.printlnList.size());
    }

    @ParameterizedTest
    @CsvSource({"10,2,5", "20,4,5", "30,2,15"})
    void vypocetPodielTest(double actualNumber1, double actualNumber2, int expectedResult)
    {
        Podiel podiel = (double cislo1, double cislo2) -> cislo1 / cislo2;
        double actualResult = podiel.zrealizujpodiel(actualNumber1,actualNumber2);
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource({"2,2,4", "3,7,10", "4,10,14"})
    void vypocetSucetTest(int actualNumber1, int actualNumber2, int expectedResult)
    {
        Sucet sucet = Integer::sum;
        int actualResult = sucet.zrealizujSucet(actualNumber1,actualNumber2);
        assertEquals(expectedResult,actualResult);
    }

    @FunctionalInterface
    interface Sucet
    {
        int zrealizujSucet(int cislo1, int cislo2);
    }

    @FunctionalInterface
    interface Podiel
    {
        double zrealizujpodiel(double cislo1, double cislo2);
    }
}
