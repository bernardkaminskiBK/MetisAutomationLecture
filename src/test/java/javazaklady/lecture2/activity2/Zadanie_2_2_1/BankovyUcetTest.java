package javazaklady.lecture2.activity2.Zadanie_2_2_1;


import javazaklady.lecture2.activity2.Zadanie_2_2_1.BankovyUcet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankovyUcetTest {

    @ParameterizedTest
    @CsvSource(value = {"1000,457,300,0.0_457.0_157.0_1000.0_1457.0_1157.0","5000,530,100,0.0_530.0_430.0_5000.0_5530.0_5430.0","800,57,100,0.0_57.0_-43.0_800.0_857.0_757.0"})
    public void bankovyUcet_test(double pociatocnyVklad,double ciastkaVloz,double ciastkaVyber, String expectedResult){
        BankovyUcet ucet = new BankovyUcet();
        BankovyUcet ucet1 = new BankovyUcet(pociatocnyVklad);

        double a0 = ucet.getAktualnyZostatok();
        ucet.vloz(ciastkaVloz);
        double a = ucet.getAktualnyZostatok();
        ucet.vyber(ciastkaVyber);
        double b =  ucet.getAktualnyZostatok();

        double c0 = ucet1.getAktualnyZostatok();
        ucet1.vloz(ciastkaVloz);
        double c = ucet1.getAktualnyZostatok();
        ucet1.vyber(ciastkaVyber);
        double d = ucet1.getAktualnyZostatok();

        String actualResult = a0 + "_" + a + "_" + b + "_" + c0 + "_" + c + "_" + d;
        System.out.println(actualResult);
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
