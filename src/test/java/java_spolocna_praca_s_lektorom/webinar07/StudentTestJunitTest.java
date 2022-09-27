package java_spolocna_praca_s_lektorom.webinar07;

import java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_1.Student;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
public class StudentTestJunitTest {

    @ParameterizedTest
    @CsvSource(value = {"Ján,Ján", "Peter, Peter", "Peter, Peter", "Marián, Marián"})
    void studetGetMenoTest(String meno, String expectedResult)
    {
        Student student = new Student(18, meno, 1.34);
        String actualResult = student.getMeno();
        assertEquals(expectedResult, actualResult, "Name should be " + expectedResult);
    }
    @ParameterizedTest
    @CsvSource(value = {"18,18", "24,24", "32,32"})
    void studentGetAgeTest(int age, int expectedResult)
    {
        Student student = new Student(age,"Fero", 1.34);
        int actualResult = student.getVek();
        assertEquals(expectedResult, actualResult, "Age should be " + expectedResult);
    }
    @ParameterizedTest
    @CsvSource(value = {"1.32,1.32", "1.87,1.87", "1.90,1.90"})
    void studentGetAverageMark(double aveMark, double expectedResult)
    {
        Student student = new Student(18, "Ján", aveMark);
        double actualResult = student.getPriemerZnamok();
        assertEquals(expectedResult, actualResult, "Mark should be " + expectedResult);
    }

    @Test
    void studentGetMenoTest()
    {
        Student student = new Student(18, "Ján", 1.67);
        String actualResult = student.getMeno();
        String expectedResult = "Ján";
        assertEquals(expectedResult, actualResult, "Name should be " + expectedResult);
    }

}
