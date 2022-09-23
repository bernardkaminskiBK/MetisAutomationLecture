package java_spolocna_praca_s_lektorom.webinar20.Zadanie_20_2_2.ohranicenia_typovych_premennych;

import java.util.ArrayList;

public class PrikladOhraniceniaZhora
{
    private static void vypisZoznamCisel(ArrayList<Integer> zoznamCisel)
    {
        for (Integer cislo : zoznamCisel)
        {
            System.out.println(cislo);
        }
    }

    private static void vypisZoznamCisel2(ArrayList<? super Integer> zoznamCisel2) // ? super = akakolvek nadtrieda triedy Integer
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

        vypisZoznamCisel2(zoznamCisel);
        vypisZoznamCisel2(zoznamCisel2);
    }
}
