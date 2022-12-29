package javazaklady2.Webinar07_Test.part3;


import javazaklady.lecture7.activity3.part3.Bankovka;
import javazaklady.lecture7.activity3.part3.Minca;
import javazaklady.lecture7.activity3.part3.Pokladna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PokladnaTest {

    @ParameterizedTest
    @CsvSource(value = {"150,1000,1000,10,2870","1000,2000,2000,10,20","6000,3000,1000,20,40"})
    public void prijmiBankovkyTest(double cenaTovar1, double cenaTovar2,double cenaTovar3,int pocetPenazi, int expectedResult){

        Bankovka patstovka = new Bankovka("Patstoeurovka",500);
        Minca dvojeurovka = new Minca("Dvojeurovka",2);
        Pokladna pokladna = new Pokladna();

        pokladna.naskenujTovar(cenaTovar1);
        pokladna.naskenujTovar(cenaTovar2);
        pokladna.naskenujTovar(cenaTovar3);
        pokladna.prijmiMince(pocetPenazi,dvojeurovka);
        pokladna.prijmiBankovky(pocetPenazi,patstovka);
        Assertions.assertEquals(expectedResult,pokladna.datVydavok());

    }
}
