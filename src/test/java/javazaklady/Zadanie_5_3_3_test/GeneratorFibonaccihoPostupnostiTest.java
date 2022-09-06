package javazaklady.Zadanie_5_3_3_test;

import javazaklady.Zadanie_5_3_3.GeneratorFibonaccihoPostupnosti;
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
