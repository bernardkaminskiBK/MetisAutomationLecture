package java_spolocna_praca_s_lektorom.webinar16.Zadanie_16_2_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProblemySPoliami2Test {

    @ParameterizedTest
    @CsvSource(value = {"Game of thrones,20,2,Game of thrones", "Assassins creed,10,0.5,Assassins creed",
            "JUnit5,12.5,0.7,JUnit5"})
    void getNazovTest(String nazov, double cena, double vaha, String expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        String actualResult = vyrobok.getNazov();
        assertEquals(expectedResult,actualResult);
    }


    @ParameterizedTest
    @CsvSource(value = {"Game of thrones,20,2,20", "Assassins creed,10,0.5,10",
            "JUnit5,12.5,0.7,12.5"})
    void getCenaTest(String nazov, double cena, double vaha, double expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        double actualResult = vyrobok.getCena();
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Game of thrones,20,2,2", "Assassins creed,10,0.5,0.5",
            "JUnit5,12.5,0.7,0.7"})
    void getVahaTest(String nazov, double cena, double vaha, double expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        double actualResult = vyrobok.getVaha();
        assertEquals(expectedResult,actualResult);
    }
}