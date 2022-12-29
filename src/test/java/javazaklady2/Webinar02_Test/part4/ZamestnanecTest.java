package javazaklady2.Webinar02_Test.part4;


import javazaklady.lecture2.activity3.part4.Zamestnanec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ZamestnanecTest {

    @ParameterizedTest
    @CsvSource(value = {"Stefan,500,Stefan","Ignac,300,Ignac","Bonifac,400,Bonifac"})
    public void getMenoTest(String meno,double plat, String expectedResult){
        Zamestnanec osoba = new Zamestnanec(meno,plat);
        Assertions.assertEquals(expectedResult,osoba.getMeno());
    }

    @ParameterizedTest
    @CsvSource(value = {"Stefan,500.0,500.0","Ignac,300.0,300.0","Bonifac,400.0,400.0"})
    public void getPlatTest(String meno,double plat, double expectedResult){
        Zamestnanec osoba = new Zamestnanec(meno,plat);
        Assertions.assertEquals(expectedResult,osoba.getPlat());
    }

    @ParameterizedTest
    @CsvSource(value = {"Stefan,500,50,750.0","Ignac,300.0,50,450.0","Bonifac,400.0,50,600.0"})
    public void navysPlatTest(String meno,double plat,double ciastka, double expectedResult){
        Zamestnanec osoba = new Zamestnanec(meno,plat);
        osoba.navysPlat(ciastka);
        double actualResult = osoba.getPlat();
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
