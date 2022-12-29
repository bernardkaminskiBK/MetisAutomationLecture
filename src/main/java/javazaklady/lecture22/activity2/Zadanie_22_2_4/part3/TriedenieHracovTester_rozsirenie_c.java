package javazaklady.lecture22.activity2.Zadanie_22_2_4.part3;

import javazaklady.lecture22.activity2.Zadanie_22_2_4.Hrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TriedenieHracovTester_rozsirenie_c
{
    public static void main(String[] args)
    {
        List<Hrac> zoznamHracov = new ArrayList<>();

        zoznamHracov.add(new Hrac("Peter", "Kovac", 10));
        zoznamHracov.add(new Hrac("Peter", "Ivanovic", 10));
        zoznamHracov.add(new Hrac("Jan", "Ivanovic", 10));
        zoznamHracov.add(new Hrac("Adam", "Vojkovic", 7));
        zoznamHracov.add(new Hrac("Miro", "Godal", 12));

        // vytvor komparator pomocou lambda vyrazu (len podla priezviska)
        Comparator<Hrac> podlaPriezviska = (Hrac h1, Hrac h2) -> h1.getPriezvisko().compareTo(h2.getPriezvisko());

        System.out.println("Zoznam hracov (pred zotriedenim): ");
        zoznamHracov.forEach(hrac -> System.out.println(hrac));

        Collections.sort(zoznamHracov, podlaPriezviska);

        System.out.println("\nZoznam hracov (po zotriedeni): ");
        zoznamHracov.forEach(hrac -> System.out.println(hrac));
    }
}
