package java_spolocna_praca_s_lektorom.webinar27.Zadanie27_2_2;

import java_spolocna_praca_s_lektorom.webinar27.Zadanie_27_2_2.Student;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {
    @ParameterizedTest
    @CsvSource(value = {"Michal,Malina,1.23,Michal", "Peter,Suchý,2.01,Peter", "Juraj,Petrovič,1.54,Juraj"})
    void getMenoTest(String meno, String priezvisko, double priemerZnamok, String expectedResult)
    {
        Student student = new Student(meno, priezvisko, priemerZnamok);
        String actualResult = student.getMeno();
        assertEquals(expectedResult,actualResult);

    }
}
