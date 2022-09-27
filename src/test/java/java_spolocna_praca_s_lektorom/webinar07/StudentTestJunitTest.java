package java_spolocna_praca_s_lektorom.webinar07;

import java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_1.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StudentTestJunitTest {


    @ParameterizedTest
    @CsvSource(value = {"Ján,Ján", "Peter, Peter", "Peter, Peter", "Marián, Marián"})
    void studetGetMenoTest(String meno, String expectedResult)
    {
        Student student = new Student(18, meno, 1.34);
        String actualResult = student.getMeno();
        Assertions.assertEquals(expectedResult, actualResult);
    }


    @Test
    void studentGetMenoTest()
    {
        Student student = new Student(18, "Ján", 1.67);
        String actualResult = student.getMeno();
        String expectedResult = "Ján";
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
