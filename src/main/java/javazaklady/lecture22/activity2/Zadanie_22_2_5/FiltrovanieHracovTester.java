package javazaklady.lecture22.activity2.Zadanie_22_2_5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FiltrovanieHracovTester
{
    public static void main(String[] args)
    {
        List<Hrac> zoznamHracov = new ArrayList<>();
        List<Hrac> hraciNad10Golov = new ArrayList<>();

        zoznamHracov.add(new Hrac("Peter", "Kovac", 10));
        zoznamHracov.add(new Hrac("Peter", "Ivanovic", 10));
        zoznamHracov.add(new Hrac("Jan", "Ivanovic", 10));
        zoznamHracov.add(new Hrac("Adam", "Vojkovic", 7));
        zoznamHracov.add(new Hrac("Miro", "Godal", 12));

        Predicate<Hrac> kriteriumNaHraca = (hrac) -> hrac.getPocetGolov() >= 10 &&
                hrac.getPriezvisko().startsWith("Ivan");

        zoznamHracov
                .stream()
                .filter(kriteriumNaHraca)
                .forEach(hrac -> hraciNad10Golov.add(hrac));

        System.out.println("Pocet hracov splnajucich kriterium: " + hraciNad10Golov.size());
        hraciNad10Golov.forEach(hrac -> System.out.println(hrac));
    }
}
