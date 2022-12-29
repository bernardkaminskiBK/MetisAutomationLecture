package javazaklady.lecture8.activity2.zadanie_8_2_2;

import javazaklady.lecture8.activity2.zadanie_8_2_2.Minca;
import javazaklady.lecture8.activity2.zadanie_8_2_2.MnozinaDat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class MnozinaDatTest
{

    @ParameterizedTest
    @CsvSource(value = {"Desatcentovka,0.1,Desatcentovka", "Dvadsatcentovka,0.2,Dvadsatcentovka",
    "Eurovka,1.0,Eurovka"})
    void mincaGetNazovTest(String nazov, double hodnota, String expectedResult)
    {
        Minca minca = new Minca(nazov, hodnota);
        String actualResult = minca.getNazov();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Desatcentovka,0.1,0.1", "Dvadsatcentovka,0.2,0.2",
            "Eurovka,1.0,1.0"})
    void mincaGetHodnotaTest(String nazov, double hodnota, double expectedResult)
    {
        Minca minca = new Minca(nazov, hodnota);
        double actualResult = minca.getHodnota();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource("Desatcentovka,0.1")
    void mincaPridajPrvokTest(String nazov, double hodnota)
    {
        Minca minca = new Minca(nazov, hodnota);
        MnozinaDat mnozinaDat = new MnozinaDat();
        mnozinaDat.pridajPrvok(minca);
        Assertions.assertEquals(0.1, minca.getHodnota());
    }

    @Test
    void mincaGetMinimum()
    {
        Minca minca1 = new Minca("Eurovka", 1.0);
        Minca minca2 = new Minca("Centovka", 0.01);
        Minca minca3 = new Minca("Patcentovka", 0.05);

        MnozinaDat mnozinaDat = new MnozinaDat();
        mnozinaDat.pridajPrvok(minca1);
        mnozinaDat.pridajPrvok(minca2);
        mnozinaDat.pridajPrvok(minca3);
        Assertions.assertEquals(0.01, mnozinaDat.getMinimum().getHodnota());
    }

    @Test
    void mincaGetMaximum()
    {
        Minca minca1 = new Minca("Eurovka", 1.0);
        Minca minca2 = new Minca("Centovka", 0.01);
        Minca minca3 = new Minca("Patcentovka", 0.05);

        MnozinaDat mnozinaDat = new MnozinaDat();
        mnozinaDat.pridajPrvok(minca1);
        mnozinaDat.pridajPrvok(minca2);
        mnozinaDat.pridajPrvok(minca3);
        Assertions.assertEquals(1.0, mnozinaDat.getMaximum().getHodnota());
    }

}
