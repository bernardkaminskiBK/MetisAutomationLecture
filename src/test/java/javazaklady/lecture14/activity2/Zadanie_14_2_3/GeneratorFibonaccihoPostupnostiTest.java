package javazaklady.lecture14.activity2.Zadanie_14_2_3;

import javazaklady.lecture14.activity2.Zadanie_14_2_3.GeneratorFibonaccihoPostupnosti;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratorFibonaccihoPostupnostiTest {

    @ParameterizedTest
    @CsvSource(value = {"2,1","4,3","5,5"})
    public void vypisPostupnost(int poradie,int expectedResult){
        int n = poradie;
        GeneratorFibonaccihoPostupnosti generator = new GeneratorFibonaccihoPostupnosti(n);
        long actualResult = generator.dalsieCislo();
        Assertions.assertEquals(expectedResult,actualResult);
        System.out.println(n + ". cislo vo Fibonacciho postupnosti je cislo: " + actualResult);
    }
}