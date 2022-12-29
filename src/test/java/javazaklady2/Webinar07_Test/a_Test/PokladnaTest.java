package javazaklady2.Webinar07_Test.a_Test;


import javazaklady2.Webinar07.part1.Minca;
import javazaklady2.Webinar07.part1.Pokladna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PokladnaTest {

    @ParameterizedTest
    @CsvSource(value = {"150,1000,1000,3000,850","1000,2000,2000,6000,1000","6000,3000,1000,10002,2"})
    public void prijmiHotovostTest(double cenaTovar1, double cenaTovar2,double cenaTovar3,int hotovost, int expectedResult){

        Pokladna pokladna = new Pokladna();
        pokladna.naskenujTovar(cenaTovar1);
        pokladna.naskenujTovar(cenaTovar2);
        pokladna.naskenujTovar(cenaTovar3);

        Minca minca = new Minca("Eurovka",1);
        pokladna.prijmiHotovost(hotovost,minca);

        Assertions.assertEquals(expectedResult,pokladna.datVydavok());
    }
}
