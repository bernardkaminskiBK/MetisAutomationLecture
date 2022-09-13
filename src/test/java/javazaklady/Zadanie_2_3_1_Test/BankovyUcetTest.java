package javazaklady.Zadanie_2_3_1_Test;


import javazaklady.Zadanie_2_3_1.BankovyUcet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankovyUcetTest {

    @ParameterizedTest
    @CsvSource(value = {"500,0,500","1000,0,1000","2500,0,2500"})
    public void BankovyUcetTest(double pociatocnyVklad, double expectedResultWithoutDeposit, double expectedResultWithDeposit){
        BankovyUcet ucet_0 = new BankovyUcet();
        BankovyUcet ucet = new BankovyUcet(pociatocnyVklad);
        Assertions.assertEquals(expectedResultWithoutDeposit,ucet_0.getAktualnyZostatok());
        Assertions.assertEquals(expectedResultWithDeposit,ucet.getAktualnyZostatok());
    }

    @ParameterizedTest
    @CsvSource(value = {"500,500,1000","1000,100,1100","2500,500,3000"})
    public void vlozTest(double pociatocnyVklad,double ciastka, double expectedResult){
        BankovyUcet ucet = new BankovyUcet(pociatocnyVklad);
        ucet.vloz(ciastka);
        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }

    @ParameterizedTest
    @CsvSource(value = {"500,200,300","1000,100,900","2500,500,2000"})
    public void vyberTest(double pociatocnyVklad,double ciastka, double expectedResult){
        BankovyUcet ucet = new BankovyUcet(pociatocnyVklad);
        ucet.vyber(ciastka);
        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }

    @ParameterizedTest
    @CsvSource(value = {"500,200,1000,1300","1000,100,1000,1900","2500,500,500,2500"})
    public void getAktualnyZostatokTest(double pociatocnyVklad,double ciastkaVyber,double ciastkaVloz, double expectedResult){
        BankovyUcet ucet = new BankovyUcet(pociatocnyVklad);
        ucet.vyber(ciastkaVyber);
        ucet.vloz(ciastkaVloz);
        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }

}
