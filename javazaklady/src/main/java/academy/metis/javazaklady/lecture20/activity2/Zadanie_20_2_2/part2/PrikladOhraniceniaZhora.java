package academy.metis.javazaklady.lecture20.activity2.Zadanie_20_2_2.part2;

import java.util.ArrayList;

public class PrikladOhraniceniaZhora
{
    private static void vypisDruhejMocninyCisel(ArrayList<Number> zoznamCisel)
    {
        for (Number cislo : zoznamCisel)
        {
            System.out.println(cislo.intValue() * cislo.intValue());
        }
    }

    private static void vypisDruhejMocninyCisel2(ArrayList<? extends Number> zoznamCisel2) // akakolvek podtrieda triedy Number
    {
        for (Number cislo : zoznamCisel2)
        {
            if (cislo instanceof Double)
            {
                System.out.println(cislo.doubleValue() * cislo.doubleValue());
            }
            if (cislo instanceof Integer)
            {
                System.out.println(cislo.intValue() * cislo.intValue());
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Number> zoznamCisel = new ArrayList<>();
        zoznamCisel.add(1);
        zoznamCisel.add(2);
        zoznamCisel.add(3);

        ArrayList<Double> zoznamCisel2 = new ArrayList<>();
        zoznamCisel2.add(1.4);
        zoznamCisel2.add(2.6);
        zoznamCisel2.add(5.5);

        vypisDruhejMocninyCisel(zoznamCisel);
        vypisDruhejMocninyCisel2(zoznamCisel2);
    }
}