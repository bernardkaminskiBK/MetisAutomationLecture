package javazaklady.Webinar06_Test.a_Test;


import javazaklady.Webinar06.a.Banka;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BankaTest {

    @ParameterizedTest
    @CsvSource(value = {"150,1000,1000","3,2000,2000","6,8000,8000"})
    public void pridajUcetTest(int cisloUctu, int pociatocnyZostatok, int expectedResult){
        Banka banka = new Banka();
        banka.pridajUcet(cisloUctu,pociatocnyZostatok);
        //System.out.println(banka.najdiUcet(cisloUctu));

        Assertions.assertEquals(expectedResult,banka.getAktualnyZostatok(cisloUctu));
    }

    @ParameterizedTest
    @CsvSource(value = {"150,1000,100,1100","3,2000,100,2100","6,8000,100,8100"})
    public void vlozTest(int cisloUctu, int pociatocnyZostatok,double ciastka, int expectedResult){
        Banka banka = new Banka();
        banka.pridajUcet(cisloUctu,pociatocnyZostatok);
        banka.vloz(cisloUctu,ciastka);

        Assertions.assertEquals(expectedResult,banka.getAktualnyZostatok(cisloUctu));
    }

    @ParameterizedTest
    @CsvSource(value = {"150,1000,100,900","3,2000,100,1900","6,8000,100,7900"})
    public void vyberTest(int cisloUctu, int pociatocnyZostatok,double ciastka, int expectedResult){
        Banka banka = new Banka();
        banka.pridajUcet(cisloUctu,pociatocnyZostatok);
        banka.vyber(cisloUctu,ciastka);

        Assertions.assertEquals(expectedResult,banka.getAktualnyZostatok(cisloUctu));
    }

    @ParameterizedTest
    @CsvSource(value = {"150,1000,100,200,1100","3,2000,100,200,2100","6,8000,100,200,8100"})
    public void getAktualnyZostatokTest(int cisloUctu, int pociatocnyZostatok,double vyberCiastka,double vlozCiastka, int expectedResult){
        Banka banka = new Banka();
        banka.pridajUcet(cisloUctu,pociatocnyZostatok);
        banka.vyber(cisloUctu,vyberCiastka);
        banka.vloz(cisloUctu,vlozCiastka);

        Assertions.assertEquals(expectedResult,banka.getAktualnyZostatok(cisloUctu));
    }

    @ParameterizedTest
    @CsvSource(value = {"150,1000,100,2","3,2000,100,2","6,8000,100,2"})
    public void getBankoveUctyTest(int cisloUctu, int pociatocnyZostatok,double ciastka, int expectedResult){
        Banka banka = new Banka();
        banka.pridajUcet(cisloUctu,pociatocnyZostatok);
        banka.pridajUcet(15222,1500);
        banka.vyber(cisloUctu,ciastka);
        Assertions.assertEquals(expectedResult,banka.getBankoveUcty().size());

    }
}
