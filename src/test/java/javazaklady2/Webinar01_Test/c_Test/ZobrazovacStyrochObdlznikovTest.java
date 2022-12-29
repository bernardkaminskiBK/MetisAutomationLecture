package javazaklady2.Webinar01_Test.c_Test;


import javazaklady2.Webinar01.part3.ZobrazovacStyrochObdlznikov;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.*;

public class ZobrazovacStyrochObdlznikovTest {

    @ParameterizedTest
    @CsvSource(value = {"0,0,0,0", "10,0,10,0", "0,0,0,0"})
    public void test(int x, int y, int expectedX, int expectedY) {
        Rectangle obdlznik = new Rectangle(0, 0, 10, 5);
        ZobrazovacStyrochObdlznikov.posunObdlznik(obdlznik, x, y);

        Assertions.assertEquals(obdlznik.getX(), expectedX);
        Assertions.assertEquals(obdlznik.getY(), expectedY);
    }
}
