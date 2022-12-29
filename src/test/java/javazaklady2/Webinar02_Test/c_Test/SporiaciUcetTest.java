package javazaklady2.Webinar02_Test.c_Test;


import javazaklady2.Webinar02.c.SporiaciUcet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SporiaciUcetTest {

    @ParameterizedTest
    @CsvSource(value = {"500,0.05,0,500","1000,0.05,0,1000","2500,0.05,0,2500"})
    public void sporiaciUcetTest(double pociatocnyVklad,double urokovaSadzba, double expectedResultWithoutDeposit, double expectedResultWithDeposit){
        SporiaciUcet ucet_0 = new SporiaciUcet();
        SporiaciUcet ucet = new SporiaciUcet(pociatocnyVklad,urokovaSadzba);

        Assertions.assertEquals(expectedResultWithoutDeposit,ucet_0.getAktualnyZostatok());
        Assertions.assertEquals(expectedResultWithDeposit,ucet.getAktualnyZostatok());
    }

    @ParameterizedTest
    @CsvSource(value = {"500,10,550","1000,0.05,1000.5","2500,0.05,2501.25"})
    public void pripisUrokTest(double pociatocnyVklad,double urokovaSadzba, double expectedResult){
        SporiaciUcet ucet = new SporiaciUcet(pociatocnyVklad,urokovaSadzba);
        ucet.pripisUrok();

        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }

    @ParameterizedTest
    @CsvSource(value = {"500,10,500,1000","1000,0.05,500,1500","2500,0.05,500,3000"})
    public void vlozTest(double pociatocnyVklad,double urokovaSadzba,double vlozCiastka, double expectedResult){
        SporiaciUcet ucet = new SporiaciUcet(pociatocnyVklad,urokovaSadzba);
        ucet.vloz(vlozCiastka);


        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }

    @ParameterizedTest
    @CsvSource(value = {"500,10,200,300","1000,0.05,500,500","2500,0.05,500,2000"})
    public void vyberTest(double pociatocnyVklad,double urokovaSadzba,double vyberCiastka, double expectedResult){
        SporiaciUcet ucet = new SporiaciUcet(pociatocnyVklad,urokovaSadzba);
        ucet.vyber(vyberCiastka);

        System.out.println(ucet.getAktualnyZostatok());
        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }

    @ParameterizedTest
    @CsvSource(value = {"500,10,200,100,440","1000,0.05,500,100,600.3","2500,0.05,500,100,2101.05"})
    public void getAktualnyZostatokTest(double pociatocnyVklad,double urokovaSadzba,double vyberCiastka,double vlozCiastka, double expectedResult){
        SporiaciUcet ucet = new SporiaciUcet(pociatocnyVklad,urokovaSadzba);
        ucet.vyber(vyberCiastka);
        ucet.vloz(vlozCiastka);
        ucet.pripisUrok();

        Assertions.assertEquals(expectedResult,ucet.getAktualnyZostatok());
    }
}
