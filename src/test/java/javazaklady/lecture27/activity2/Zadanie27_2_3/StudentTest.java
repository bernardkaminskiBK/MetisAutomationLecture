package javazaklady.lecture27.activity2.Zadanie27_2_3;

import javazaklady.lecture27.activity2.Zadanie_27_2_3.Student;
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

    @ParameterizedTest
    @CsvSource(value = {"Michal,Malina,1.23,Malina", "Peter,Suchý,2.01,Suchý", "Juraj,Petrovič,1.54,Petrovič"})
    void getPriezviskoTest(String meno, String priezvisko, double priemerZnamok, String expectedResult)
    {
        Student student = new Student(meno, priezvisko, priemerZnamok);
        String actualResult = student.getPriezvisko();
        assertEquals(expectedResult,actualResult);

    }

    @ParameterizedTest
    @CsvSource(value = {"Michal,Malina,1.23,1.23", "Peter,Suchý,2.01,2.01", "Juraj,Petrovič,1.54,1.54"})
    void getPriemerZnamokTest(String meno, String priezvisko, double priemerZnamok, double expectedResult)
    {
        Student student = new Student(meno, priezvisko, priemerZnamok);
        double actualResult = student.getPriemerZnamok();
        assertEquals(expectedResult,actualResult);

    }
}
