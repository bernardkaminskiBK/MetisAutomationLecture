package java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_4.problem03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TriedenieHracovTester_zakladnaUloha_a
{
    public static void main(String[] args)
    {
        List<Hrac> zoznamHracov = new ArrayList<>();

        zoznamHracov.add(new Hrac("Peter", "Kovac", 10));
        zoznamHracov.add(new Hrac("Peter", "Ivanovic", 10));
        zoznamHracov.add(new Hrac("Jan", "Ivanovic", 10));
        zoznamHracov.add(new Hrac("Adam", "Vojkovic", 7));
        zoznamHracov.add(new Hrac("Miro", "Godal", 12));

        // vytvor komparator pomocou method reference (operator ::)
        Comparator<Hrac> podlaPoctuGolov = Comparator.comparing(Hrac::getPocetGolov);

        // zabezpec opacne poradie zotriedenia - od najvacsieho po nejmensie - vid riadok nizsie
        // Comparator<Hrac> podlaPoctuGolov = Comparator.comparing(Hrac::getPocetGolov).reversed();

        //nizsie riadky predstavuju jeden uceleny riadok
        zoznamHracov
                .stream()
                .sorted(podlaPoctuGolov)
                .map(hrac -> hrac.getMeno() + " " + hrac.getPriezvisko() + " " + hrac.getPocetGolov())
                .forEach(hrac -> System.out.println(hrac));
    }
}
