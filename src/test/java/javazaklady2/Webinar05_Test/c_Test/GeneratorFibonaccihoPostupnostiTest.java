package javazaklady2.Webinar05_Test.c_Test;

import javazaklady2.Webinar05.c.GeneratorFibonaccihoPostupnosti;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratorFibonaccihoPostupnostiTest {

    @ParameterizedTest
    @CsvSource(value = {"2,1","3,2","6,8"})
    public void dalsieCisloTest(int cislo, int expectedResult){

        GeneratorFibonaccihoPostupnosti postupnost = new GeneratorFibonaccihoPostupnosti(cislo);
        Assertions.assertEquals(expectedResult,postupnost.dalsieCislo());

    }
}
