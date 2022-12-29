package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImmutableStudentTest {


    @ParameterizedTest
    @CsvSource(value = {"Ján,Ján", "Peter, Peter", "Peter, Peter", "Marián, Marián"})
    void studetGetNameTest(String meno, String expectedResult)
    {
       ImmutableStudent student = new ImmutableStudent(18, meno, 1.34);
        String actualResult = student.getMeno();
        assertEquals(expectedResult, actualResult, "Name should be " + expectedResult);
    }


    @ParameterizedTest
    @CsvSource(value = {"18,18", "24,24", "32,32"})
    void studentGetAgeTest(int age, int expectedResult)
    {
        ImmutableStudent student = new ImmutableStudent(age,"Fero", 1.34);
        int actualResult = student.getVek();
        assertEquals(expectedResult, actualResult, "Age should be " + expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"1.32,1.32", "1.87,1.87", "1.90,1.90"})
    void studentGetAverageMark(double aveMark, double expectedResult)
    {
        ImmutableStudent student = new ImmutableStudent(18, "Ján", aveMark);
        double actualResult = student.getPriemerZnamok();
        assertEquals(expectedResult, actualResult, "Mark should be " + expectedResult);
    }

}
