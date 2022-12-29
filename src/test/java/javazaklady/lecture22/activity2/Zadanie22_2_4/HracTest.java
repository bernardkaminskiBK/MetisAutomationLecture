package javazaklady.lecture22.activity2.Zadanie22_2_4;

import javazaklady.lecture22.activity2.Zadanie_22_2_4.Hrac;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HracTest {
    @ParameterizedTest
    @CsvSource(value = {"Juraj,Makarón,10,Juraj", "Peter,Petrovič,18,Peter","Monika,Chochlíková,20,Monika","Tomáš,Tadlánek,25,Tomáš"})
    void hracGetMenoTest(String meno, String priezvisko, int pocetGolov, String expectedResult)
    {
        Hrac hrac = new Hrac(meno, priezvisko,pocetGolov);
        String actualResult = hrac.getMeno();
        assertEquals(actualResult,expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Juraj,Makarón,10,Makarón", "Peter,Petrovič,18,Petrovič","Monika,Chochlíková,20,Chochlíková","Tomáš,Tadlánek,25,Tadlánek"})
    void hracPriezviskoTest(String meno, String priezvisko, int pocetGolov, String expectedResult)
    {
        Hrac hrac = new Hrac(meno, priezvisko,pocetGolov);
        String actualResult = hrac.getPriezvisko();
        assertEquals(actualResult,expectedResult);
    }

    @ParameterizedTest
    @CsvSource(value = {"Juraj,Makarón,10,10", "Peter,Petrovič,18,18","Monika,Chochlíková,20,20","Tomáš,Tadlánek,25,25"})
    void hracGetPocetGolovTest(String meno, String priezvisko, int pocetGolov, int expectedResult)
    {
        Hrac hrac = new Hrac(meno, priezvisko,pocetGolov);
        int actualResult = hrac.getPocetGolov();
        assertEquals(actualResult,expectedResult);
    }


    @Test
    void triedenieHracovTest()
    {
        List<Hrac> hraci = new ArrayList<>();
        hraci.add(new Hrac("Maroš", "Molnár", 26));
        hraci.add(new Hrac("Juraj", "Dakarón", 29));
        hraci.add(new Hrac("Peter", "Sagan", 23));
        hraci.add(new Hrac("Juraj", "Sagan", 23));
        hraci.add(new Hrac("Peter", "Lolnár", 23));

        Comparator<Hrac> podlaPoctuGolov = Comparator.comparing(Hrac::getPocetGolov)
                .thenComparing(Hrac::getPriezvisko)
                .thenComparing(Hrac::getMeno)
                .reversed();


        hraci.stream()
                .sorted(podlaPoctuGolov)
                .map(hraciSk -> hraciSk.getMeno() + " " + hraciSk.getPriezvisko() + " " + hraciSk.getPocetGolov())
                .forEach(System.out::println);


    }


}
