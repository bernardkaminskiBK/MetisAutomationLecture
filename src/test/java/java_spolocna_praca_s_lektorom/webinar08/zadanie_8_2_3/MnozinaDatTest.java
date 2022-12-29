package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_3;

import javazaklady.lecture8.activity2.zadanie_8_2_3.BankovyUcet;
import javazaklady.lecture8.activity2.zadanie_8_2_3.Minca;
import javazaklady.lecture8.activity2.zadanie_8_2_3.MnozinaDat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class MnozinaDatTest
{
    @ParameterizedTest
    @CsvSource(value = {"1000,1000", "2000,2000", "3000,3000"})
    void getMieraTest(double aktual, double expected)
    {
        BankovyUcet bankovyUcet = new BankovyUcet(aktual);
        double actualResult = bankovyUcet.getMiera();
        Assertions.assertEquals(expected,actualResult);
    }

    @Test
    void mincaMieraTest()
    {
        MnozinaDat mnozinaDat = new MnozinaDat();

        Minca minca1 = new Minca("Dvojeurovka", 2.0);
        Minca minca2 = new Minca("Eurovka", 1.0);
        Minca minca3 = new Minca("Dvatsatcentovka", 0.2);

        mnozinaDat.pridajPrvok(minca1);
        mnozinaDat.pridajPrvok(minca2);
        mnozinaDat.pridajPrvok(minca3);

        Assertions.assertEquals(0.2, mnozinaDat.getMinimum().getMiera());


    }
}


