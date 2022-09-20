package profun_spolocna_praca_s_lektorom.Lekcia8.zadanie3;

import java.util.Scanner;

public class Statistiky
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.print("zadaj cislo1: ");
        double cislo1 = vstup.nextDouble();
        System.out.print("zadaj cislo2: ");
        double cislo2 = vstup.nextDouble();

        System.out.println("\nsucet = " + vypocitajSucet(cislo1,cislo2));
        System.out.println("rozdiel = " + vypocitajRozdiel(cislo1, cislo2));
        System.out.println("podiel = " + vypocitajPodiel(cislo1, cislo2));
        System.out.println("sucin = " + vypocitajSucin(cislo1, cislo2));
    }

    public static double vypocitajSucet(double x, double y)
    {
        double sucet = x + y;
        return sucet;
    }

    public static double vypocitajRozdiel(double x, double y)
    {
        double rozdiel = x - y;
        return rozdiel;
    }

    public static double vypocitajPodiel(double x, double y)
    {
        double podiel = x / y;
        return podiel;
    }

    public static double vypocitajSucin(double x, double y)
    {
        double sucin = x * y;
        return sucin;
    }
}
