package javazaklady.Zadanie_1_3_2_Test;


import javazaklady.Webinar01.Zadanie_1_3_2.ObvodObdlznikaTester;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.*;

public class ObvodObdlznikaTesterTest {

    @ParameterizedTest
    @CsvSource(value = {"10,10,50,100,300", "30,30,200,500,1400", "3,5,900,800,3400"})
    public void vypisObsah(int x, int y, int width, int height, int expectedResult){

        double actualResult = ObvodObdlznikaTester.getObvod(new Rectangle(x, y, width,height));

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
