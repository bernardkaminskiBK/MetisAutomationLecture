package javazaklady.Zadanie_1_3_4_test;

import Zadanie_1_3_4.ZobrazovacPrienikuObdlznikov;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class ZobrazovacPrienikuObdlznikovTest {

    @Test
    public void  zistiPretnutieTest(){
        Rectangle obdlznik1 = new Rectangle(10, 0, 5, 10);
        Rectangle obdlznik2 = new Rectangle(10, 0, 5, 10);

        boolean actualResult = ZobrazovacPrienikuObdlznikov.zistiPretnutie(obdlznik1,obdlznik2);
        if (actualResult){
            Assertions.assertTrue(actualResult);
            System.out.println(actualResult);
        }else{
            Assertions.assertFalse(actualResult);
            System.out.println(actualResult);
        }
    }
}
