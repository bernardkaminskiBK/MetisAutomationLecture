package java_spolocna_praca_s_lektorom.webinar20.Zadanie_20_2_2.ohranicenia_typovych_premennych;

import java.util.ArrayList;

public class PrikladOhraniceniaZdola
{
    private static void vypisDruheMocninyCisel(ArrayList<Number> zoznamCisel)
    {
        for (Number cislo : zoznamCisel)
        {
            System.out.println(cislo.intValue() * cislo.intValue());
        }
    }

    private static void vypisDruheMocninyCisel2(ArrayList<? extends Number> zoznamCisel2) // akakolvek podtrieda triedy Number
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

        vypisDruheMocninyCisel2(zoznamCisel);
        vypisDruheMocninyCisel2(zoznamCisel2);
    }
}
