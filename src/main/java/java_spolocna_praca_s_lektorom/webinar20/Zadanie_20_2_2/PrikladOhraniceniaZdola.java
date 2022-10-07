package java_spolocna_praca_s_lektorom.webinar20.Zadanie_20_2_2;

import java.util.ArrayList;

public class PrikladOhraniceniaZdola
{
    private static void vypisDruheMocninyCisel(ArrayList<Integer> zoznamCisel)
    {
        for (Integer cislo : zoznamCisel)
        {
            System.out.println(cislo);
        }
    }
    private static void vypisDruheMocninyCisel2(ArrayList<? super Integer> zoznamCisel2) // akakolvek podtrieda triedy Number
    {

        for (Object cislo : zoznamCisel2)
        {
            System.out.println(cislo);
        }

    }



    public static void main(String[] args)
    {
        // vytvor zoznam celych cisel
        ArrayList<Integer> zoznamCisel = new ArrayList<>(); // nemoze byt<int>, musi byt obalovacia trieda
        zoznamCisel.add(1);
        zoznamCisel.add(2);
        zoznamCisel.add(3);

        ArrayList<Number> zoznamCisel2 = new ArrayList<>();
        zoznamCisel2.add(1.4);
        zoznamCisel2.add(2.6);
        zoznamCisel2.add(5.5);

        vypisDruheMocninyCisel2(zoznamCisel);
        vypisDruheMocninyCisel2(zoznamCisel2);
    }
}
