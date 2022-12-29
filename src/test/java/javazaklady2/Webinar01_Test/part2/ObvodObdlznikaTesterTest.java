package javazaklady2.Webinar01_Test.part2;


import javazaklady2.Webinar01.part2.ObvodObdlznikaTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.*;

public class ObvodObdlznikaTesterTest {

    @ParameterizedTest
    @CsvSource(value = {"10,10,50,100,300", "30,30,200,500,1400", "3,5,900,800,3400"})
    public void vypisObvod(int x, int y, int width, int height, int expectedResult){

        double actualResult = ObvodObdlznikaTester.getObvod(new Rectangle(x, y, width,height));

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
