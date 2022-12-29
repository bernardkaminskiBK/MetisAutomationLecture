package javazaklady.lecture5.activity3.part1;

import java.util.Scanner;

public class KonvertorMenyTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Aky je aktualny kurz Eura voci dolaru? (pre koniec zadajte K)");
        String kurz = vstup.nextLine();

        if (kurz.equalsIgnoreCase("k"))
        {
            vystup();
        }
        else
        {
            do
            {
                System.out.println("Kolko Eur si zelate zamenit? (pre koniec zadajte K)");
                String ciastka = vstup.nextLine();

                if (ciastka.equalsIgnoreCase("k"))
                {
                    vystup();
                    break;
                }

                KonvertorMeny konvertor = new KonvertorMeny(Double.parseDouble(kurz), Double.parseDouble(ciastka));

                System.out.println(ciastka + " Eur = " + konvertor.getDolare() + " Dolarov");
            }
            while (true);
        }
        vstup.close();
    }

    private static void vystup()
    {
        System.out.println("Program ukonceny...");
    }
}
