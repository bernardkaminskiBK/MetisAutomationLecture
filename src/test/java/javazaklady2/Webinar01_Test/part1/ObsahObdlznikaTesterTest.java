package javazaklady2.Webinar01_Test.part1;

import javazaklady.lecture1.activity3.part1.ObsahObdlznikaTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.*;

public class ObsahObdlznikaTesterTest {

    @ParameterizedTest
    @CsvSource(value = {"10,10,50,100,5000", "30,30,200,500,100000", "3,5,900,800,720000"})
    public void vypisObsah(int x, int y, int width, int height, int expectedResult){
       double actualResult = ObsahObdlznikaTester.vypisObsah(new Rectangle(x, y, width,height));

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
