package java_spolocna_praca_s_lektorom.webinar16.Zadanie_16_2_1;

import javazaklady.lecture16.activity2.Zadanie_16_2_1.Vyrobok;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProblemySPoliamiTest {


    @ParameterizedTest
    @CsvSource(value = {"Game of thrones,20,2,Game of thrones", "Assassins creed,10,0.5,Assassins creed",
            "JUnit5,12.5,0.7,JUnit5"})
    void getNazovTest(String nazov, double cena, double vaha, String expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        String actualResult = vyrobok.getNazov();
        assertEquals(expectedResult,actualResult);
    }


    @ParameterizedTest
    @CsvSource(value = {"Game of thrones,20,2,20", "Assassins creed,10,0.5,10",
            "JUnit5,12.5,0.7,12.5"})
    void getCenaTest(String nazov, double cena, double vaha, double expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        double actualResult = vyrobok.getCena();
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Game of thrones,20,2,2", "Assassins creed,10,0.5,0.5",
            "JUnit5,12.5,0.7,0.7"})
    void getVahaTest(String nazov, double cena, double vaha, double expectedResult)
    {
        Vyrobok vyrobok = new Vyrobok(nazov, cena, vaha);
        double actualResult = vyrobok.getVaha();
        assertEquals(expectedResult,actualResult);
    }

    private static Vyrobok[] pridajPrvok(Vyrobok novyVyrobok, Vyrobok[] vyrobky)
    {
        int velkost = vyrobky.length;
        Vyrobok[] novePole = Arrays.copyOf(vyrobky, velkost + 1);
        novePole[velkost] = novyVyrobok;
        return novePole;
    }

    @ParameterizedTest
    @CsvSource(value = {"Python#20#1.1#[Vyrobok{nazov='Java pre pokročilých', cena=30.0, vaha=0.3}, " +
            "Vyrobok{nazov='Lenovo Thinkpad', cena=1200.0, vaha=2.6}, Vyrobok{nazov='Python', cena=20.0, vaha=1.1}]",
            "SQL#17#0.9#[Vyrobok{nazov='Java pre pokročilých', cena=30.0, vaha=0.3}, " +
                    "Vyrobok{nazov='Lenovo Thinkpad', cena=1200.0, vaha=2.6}, Vyrobok{nazov='SQL', cena=17.0, vaha=0.9}]",
            "HTML#12#0.4#[Vyrobok{nazov='Java pre pokročilých', cena=30.0, vaha=0.3}, " +
                    "Vyrobok{nazov='Lenovo Thinkpad', cena=1200.0, vaha=2.6}, Vyrobok{nazov='HTML', cena=12.0, vaha=0.4}]"},
            delimiter = '#')
    void pridajPrvokTest(String nazov, double cena, double vaha, String expectedResult)
    {
        Vyrobok kniha = new Vyrobok("Java pre pokročilých", 30, 0.3);
        Vyrobok pocitac = new Vyrobok("Lenovo Thinkpad", 1200, 2.6);
        Vyrobok[] vyrobky = { kniha, pocitac };
        Vyrobok novyVyrobok = new Vyrobok(nazov, cena, vaha);
        vyrobky = pridajPrvok(novyVyrobok, vyrobky);
        String actualResult = Arrays.toString(vyrobky);
        assertEquals(actualResult,expectedResult);
    }



}