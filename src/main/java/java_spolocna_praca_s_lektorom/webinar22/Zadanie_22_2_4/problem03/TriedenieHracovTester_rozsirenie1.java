package java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_4.problem03;

import java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_4.problem03.Hrac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TriedenieHracovTester_rozsirenie1
{
    public static void main(String[] args)
    {
        List<Hrac> zoznamHracov = new ArrayList<>();

        zoznamHracov.add(new Hrac("Peter", "Novak", 10));
        zoznamHracov.add(new Hrac("Peter", "Ivanovic", 10));
        zoznamHracov.add(new Hrac("Jan", "Ivanovic", 10));
        zoznamHracov.add(new Hrac("Adam", "Vojkovic", 7));
        zoznamHracov.add(new Hrac("Miro", "Godal", 12));

        // vytvor komparator pomocou method reference (operator ::)
        // podla viacerych kriterii: pocet golov, priezvisko, meno
        // TODO: nahrad zretazeny komparator pomocou klasickeho OOP pristupu (anonymna vnutorna trieda)
        Comparator<Hrac> podlaViacerychKriterii = Comparator
                .comparing(Hrac::getPocetGolov)
                        .thenComparing(Hrac::getPriezvisko)
                                .thenComparing(Hrac::getMeno);


        //nizsie riadky predstavuju jeden uceleny riadok
        zoznamHracov
                .stream()
                .sorted(podlaViacerychKriterii)
                .map(hrac -> hrac.getMeno() + " " + hrac.getPriezvisko() + " " + hrac.getPocetGolov())
                .forEach(hrac -> System.out.println(hrac));
    }
}