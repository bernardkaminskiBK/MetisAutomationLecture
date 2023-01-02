package javazaklady.lecture17.activity2.Zadanie17_2_1;

import javazaklady.lecture17.activity2.Zadanie_17_2_1.Sklad;
import javazaklady.lecture17.activity2.Zadanie_17_2_1.Vyrobok;
import javazaklady.lecture17.activity2.Zadanie_17_2_1.Zasielka;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ZasielkaTest {

    Zasielka zasielka = new Zasielka();

    @ParameterizedTest
    @CsvSource(value = {"Kalkulačka,2.50,0.2,Kalkulačka", "Rádio,20,1.5,Rádio", "Satelit,120,20,Satelit"})
    void getNazovVyrobku(String nazov, double cena, double vaha, String expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        String actualResult = vyrobok.getNazov();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Kalkulačka,2.50,0.2,2.50", "Rádio,20,1.5,20", "Satelit,120,20,120"})
    void getCenaVyrobku(String nazov, double cena, double vaha, double expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        double actualResult = vyrobok.getCena();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Kalkulačka,2.50,0.2,0.2", "Rádio,20,1.5,1.5", "Satelit,120,20,20"})
    void getVahaVyrobku(String nazov, double cena, double vaha, double expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        double actualResult = vyrobok.getVaha();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    void pridajZasielkuTest()
    {

        zasielka.pridaj(Sklad.dvere);
        zasielka.pridaj(Sklad.dlazobnaKocka);
        assertThat(zasielka).contains(Sklad.dlazobnaKocka, Sklad.dvere);
    }

    @Test
    void nahradVyrobokTest()
    {
        zasielka.pridaj(Sklad.okno);
        zasielka.pridaj(Sklad.dlazobnaKocka);
        zasielka.nahrad(Sklad.dlazobnaKocka, Sklad.dvere);
        assertThat(zasielka).containsExactly(Sklad.okno, Sklad.dvere);
    }

    @Test
    void rozdelTest()
    {
        zasielka.pridaj(Sklad.okno);
        zasielka.pridaj(Sklad.dlazobnaKocka);
        zasielka.pridaj(Sklad.dvere);
        zasielka.priprav();
        assertThat(zasielka.getTazkeVyrobky()).contains(Sklad.okno);
        assertThat(zasielka.getLahkeVyrobky()).contains(Sklad.dvere);
    }
}
