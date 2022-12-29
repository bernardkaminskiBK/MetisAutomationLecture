package javazaklady2.Webinar09_Test.d_Test;

import javazaklady2.Webinar09.part4.Instruktor;
import javazaklady2.Webinar09.part4.Osoba;
import javazaklady2.Webinar09.part4.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OsobaTesterTest {

    @Test
    public void osobaTest() {
        Osoba osoba = new Osoba("Igor Kovac", 1988);

        Assertions.assertTrue(osoba.toString().contains("Igor Kovac"));
        Assertions.assertTrue(osoba.toString().contains("1988"));
    }

    @Test
    public void student() {
        Student student = new Student("Emil Horvath", 1999, "Kartografia");

        Assertions.assertTrue(student.toString().contains("Emil Horvath"));
        Assertions.assertTrue(student.toString().contains("1999"));
        Assertions.assertTrue(student.toString().contains("Kartografia"));
    }

    @Test
    public void instruktor() {
        Instruktor instruktor = new Instruktor("Jan Valdner", 1969, 2500);

        Assertions.assertTrue(instruktor.toString().contains("Jan Valdner"));
        Assertions.assertTrue(instruktor.toString().contains("1969"));
        Assertions.assertTrue(instruktor.toString().contains("2500"));
    }

}
