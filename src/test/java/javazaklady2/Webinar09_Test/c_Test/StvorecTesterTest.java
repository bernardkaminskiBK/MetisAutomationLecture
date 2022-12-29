package javazaklady2.Webinar09_Test.c_Test;

import javazaklady2.Webinar09.part3.Stvorec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StvorecTesterTest {

    @ParameterizedTest
    @CsvSource(value = {"10,20,30,900,'Stvorec[x=-5,y=5,width=30,height=30]'",
            "5, 250, 45, 2025, 'Stvorec[x=-10,y=235,width=45,height=45]'",
            "150, 4250, 80, 6400,'Stvorec[x=135,y=4235,width=80,height=80]'"})
    public void getPlochaTest(int x, int y, int dlzkaStrany, int expectedPlocha, String expectedToStringStvorec) {
        Stvorec stvorec = new Stvorec(x, y, dlzkaStrany);

        Assertions.assertTrue(stvorec.toString().contains(expectedToStringStvorec));
        Assertions.assertEquals(expectedPlocha, stvorec.getPlocha());
    }
}
