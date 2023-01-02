package academy.metis.profun_spolocna_praca_s_lektorom.Lekcia08.zadanie2;

import java.util.Scanner;

public class OverPriestupnostRokaTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.print("zadaj rok: ");
        int rok = vstup.nextInt();

        if (jePrestupny(rok))
        {
            System.out.println("rok " + rok + " je prestupny");
        }
        else
        {
            System.out.println("rok " + rok + " nie je prestupny");
        }
    }

    public static boolean jePrestupny(int rok)
    {
        boolean jePrestupny = false;

        if (rok % 100 == 0)
        {
            if (rok % 400 == 0)
            {
                jePrestupny = true;
            }
        }
        else
        {
            if (rok % 4 == 0)
            {
                jePrestupny = true;
            }
        }
        return jePrestupny;
    }
}

