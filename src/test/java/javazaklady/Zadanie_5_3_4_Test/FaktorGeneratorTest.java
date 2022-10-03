package javazaklady.Zadanie_5_3_4_Test;


import javazaklady.Webinar05.Zadanie_5_3_4.FaktorGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FaktorGeneratorTest {

    @ParameterizedTest
    @CsvSource(value = {"150,2,3,5,5"})
    public void dalsiFaktorTest(int cislo, int expectedResult, int expectedResult2, int expectedResult3, int expectedResult4){

        FaktorGenerator faktorGenerator = new FaktorGenerator(cislo);

        Assertions.assertEquals(expectedResult, faktorGenerator.dalsiFaktor());
        Assertions.assertEquals(expectedResult2, faktorGenerator.dalsiFaktor());
        Assertions.assertEquals(expectedResult3, faktorGenerator.dalsiFaktor());
        Assertions.assertEquals(expectedResult4, faktorGenerator.dalsiFaktor());
        System.out.println(faktorGenerator.existujeDalsiFaktor());
    }

    @ParameterizedTest
    @CsvSource(value = {"150"})
    public void existujeDalsiFaktorTest(int cislo){

        FaktorGenerator faktorGenerator = new FaktorGenerator(cislo);

        Assertions.assertTrue(faktorGenerator.existujeDalsiFaktor());
        faktorGenerator.dalsiFaktor();
        Assertions.assertTrue(faktorGenerator.existujeDalsiFaktor());
        faktorGenerator.dalsiFaktor();
        Assertions.assertTrue(faktorGenerator.existujeDalsiFaktor());
        faktorGenerator.dalsiFaktor();
        Assertions.assertTrue(faktorGenerator.existujeDalsiFaktor());
        faktorGenerator.dalsiFaktor();
        Assertions.assertFalse(faktorGenerator.existujeDalsiFaktor());


    }
}
