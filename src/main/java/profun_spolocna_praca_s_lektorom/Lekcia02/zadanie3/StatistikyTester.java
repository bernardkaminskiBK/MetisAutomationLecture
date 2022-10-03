package profun_spolocna_praca_s_lektorom.Lekcia02.zadanie3;

import java.util.Scanner;

public class StatistikyTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.print("zadaj cele cislo: ");
        int cislo1 = vstup.nextInt();
        System.out.print("zadaj cele cislo: ");
        int cislo2 = vstup.nextInt();
        System.out.print("zadaj cele cislo: ");
        int cislo3 = vstup.nextInt();

        System.out.println("sucet: " + getSucet(cislo1, cislo2, cislo3));
        System.out.println("priemer: " + getPriemer(getSucet(cislo1,cislo2,cislo3)));
        System.out.println("sucin: " + getSucin(cislo1, cislo2, cislo3));
        System.out.println("minimum: " + najdiMinimum(cislo1, cislo2, cislo3));
        System.out.println("maximum: " + najdiMaximum(cislo1, cislo2, cislo3));
    }

    public static int najdiMaximum(int cislo1, int cislo2, int cislo3)
    {
        int maximum = cislo1;

        if (cislo2 > maximum)
        {
            maximum = cislo2;
        }
        if (cislo3 > maximum)
        {
            maximum = cislo3;
        }
        return maximum;
    }

    public static int najdiMinimum(int cislo1, int cislo2, int cislo3)
    {
        int minimum = cislo1;

        if (cislo2 < minimum)
        {
            minimum = cislo2;
        }
        if (cislo3 < minimum)
        {
            minimum = cislo3;
        }
        return minimum;
    }

    public static int getSucin(int cislo1, int cislo2, int cislo3)
    {
        return cislo1 * cislo2 * cislo3;
    }

    public static int getPriemer(int sucet)
    {
        return sucet / 3;
    }

    public static int getSucet(int cislo1, int cislo2, int cislo3)
    {
        return cislo1 + cislo2 + cislo3;
    }
}

