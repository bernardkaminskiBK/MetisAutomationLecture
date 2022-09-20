package profun_spolocna_praca_s_lektorom.Lekcia2.zadanie2;

import java.util.Scanner;

public class Aplikacia
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.print("zadaj cele cislo: ");
        int cislo1 = vstup.nextInt();
        System.out.print("zadaj cele cislo: ");
        int cislo2 = vstup.nextInt();

        System.out.println(porovnaj(cislo1, cislo2));
    }

    public static String porovnaj(int cislo1, int cislo2)
    {
        String text = "";

        if (cislo1 > cislo2)
        {
            text = cislo1 + " je vacsie ako " + cislo2;
        }
        else if (cislo2 > cislo1)
        {
            text = cislo2 + " je vacsie ako " + cislo1;
        }
        else
        {
            text = "nacitane cisla su zhodne";
        }
        return text;
    }
}


