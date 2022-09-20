package profun_spolocna_praca_s_lektorom.lekcia4.zadanie2.zadanie1;

import java.util.Scanner;

public class Aplikacia
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        double celkovaSpotreba = 0;
        double celkovaVzdialenost = 0;

        while (true)
        {
            System.out.print("\nzadaj mnozsstvo spotrebvaneho paliva v litroch (-1 pre ukoncenie programu): ");
            double spotreba = vstup.nextInt();

            if (spotreba == -1)
            {
                break;
            }

            System.out.print("zadaj prejdenu vzdialonost v km: ");
            double vzdialenost = vstup.nextInt();

            double priemSpotreba = getPriemSpotreba(spotreba, vzdialenost);

            celkovaSpotreba += spotreba;
            celkovaVzdialenost += vzdialenost;

            System.out.printf("aktialna priemerna spotreba na 100 km je: %.2f\n", priemSpotreba);
        }

        String text = dlhodobaPriemernaSpotreba(celkovaSpotreba, celkovaVzdialenost);
        System.out.println(text);
    }

    public static String dlhodobaPriemernaSpotreba(double celkovaSpotreba, double celkovaVzdialenost)
    {
        double dlhodobaPriemSpottreba;
        String text = "";

        if (celkovaVzdialenost == 0)
        {
            dlhodobaPriemSpottreba = 0;
            text = "\ndlhodoba priemerna spotreba je: " + dlhodobaPriemSpottreba;
        }
        else
        {
            dlhodobaPriemSpottreba = celkovaSpotreba / celkovaVzdialenost * 100;
            double dlhPriemSpotZaokruhlene = Math.round(dlhodobaPriemSpottreba * 100.0) / 100.0;

            text = "\ndlhodoba priemerna spotreba v litroch na 10 km je: " + dlhPriemSpotZaokruhlene;
        }
        return text;
    }

    public static double getPriemSpotreba(double spotreba, double vzdialenost)
    {
        return spotreba / vzdialenost * 100;
    }
}


