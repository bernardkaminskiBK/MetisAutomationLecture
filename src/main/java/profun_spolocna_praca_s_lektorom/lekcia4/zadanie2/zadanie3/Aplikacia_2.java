package profun_spolocna_praca_s_lektorom.lekcia4.zadanie2.zadanie3;

import java.util.Scanner;

public class Aplikacia_2
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        double percentualnaOdmena = 0.09;

        while (true)
        {
            System.out.print("\nzadaj tyzdenny obrat(-1 pre ukoncenie programu): ");
            double tyzdennyObrat = vstup.nextDouble();

            if (tyzdennyObrat == -1)
            {
                break;
            }

            System.out.printf("tvoja tyzdenna mzda je %.02f EUR\n", getTyzdennaMzda(tyzdennyObrat, percentualnaOdmena));
        }
        vstup.close();
        System.out.println("\n...koniec programu");
    }

    public static double getTyzdennaMzda(double tyzdennyObrat, double percentualnaOdmena)
    {
        double tyzdennaMzda = 200 + (tyzdennyObrat * percentualnaOdmena);
        return tyzdennaMzda;
    }
}

