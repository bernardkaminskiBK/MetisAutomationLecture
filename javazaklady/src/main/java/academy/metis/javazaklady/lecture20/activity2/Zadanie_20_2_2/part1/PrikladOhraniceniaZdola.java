package academy.metis.javazaklady.lecture20.activity2.Zadanie_20_2_2.part1;

import java.util.ArrayList;

public class PrikladOhraniceniaZdola
{
    public static void vypisDruhejMocninyCisel(ArrayList<Integer> zoznamCisel)
    {
        for (Integer cislo : zoznamCisel)
        {
            System.out.println(cislo);
        }
    }
    public static void vypisDruhejMocninyCisel2(ArrayList<? super Integer> zoznamCisel2) // akakolvek podtrieda triedy Number
    {
        for (Object cislo : zoznamCisel2)
        {
            System.out.println(cislo);
        }

    }

    public static void main(String[] args)
    {
//        vytvor zoznam celych cisel
        ArrayList<Integer> zoznamCisel = new ArrayList<>(); // nemoze byt<int>, musi byt obalovacia trieda
        zoznamCisel.add(1);
        zoznamCisel.add(2);
        zoznamCisel.add(3);

        ArrayList<Number> zoznamCisel2 = new ArrayList<>();
        zoznamCisel2.add(1.4);
        zoznamCisel2.add(2.6);
        zoznamCisel2.add(5.5);

        vypisDruhejMocninyCisel(zoznamCisel);
        vypisDruhejMocninyCisel2(zoznamCisel2);
    }
}
