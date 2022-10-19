package java_spolocna_praca_s_lektorom.webinar22.Zadanie22_2_5;

import java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_5.Hrac;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FiltrovanieHracovTest {

    @Test
    void kriteriumTest()
    {
        List<Hrac> zoznamHracov = new ArrayList<>();
        List<Hrac> hraciNad10Golov = new ArrayList<>();
        zoznamHracov.add(new Hrac("Juraj", "Lacko", 23));
        zoznamHracov.add(new Hrac("Milan", "Lackovič", 29));
        zoznamHracov.add(new Hrac("Michal", "Feray", 16));
        zoznamHracov.add(new Hrac("Martin", "Tomčík", 9));
        zoznamHracov.add(new Hrac("Ondrej", "Stránsky", 12));
        zoznamHracov.add(new Hrac("Tomáš", "Gogál", 31));

        Predicate<Hrac> kriteriumNaHraca = (hrac) -> hrac.getPocetGolov() >=10 &&
                hrac.getPriezvisko().startsWith("Lacko");

        zoznamHracov.stream()
                .filter(kriteriumNaHraca)
                .forEach(hraciNad10Golov::add);

        for (Hrac hrac : hraciNad10Golov) {
            System.out.println(hrac + " ");
        }

    }
}
