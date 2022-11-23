package profun_spolocna_praca_s_lektorom.Lekcia02.zadanie1;

import java.util.Scanner;

public class MatematickeOperacieTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("zadaj cele cislo: ");
        int cislo1 = vstup.nextInt();

        System.out.println("zadaj cele cislo: ");
        int cislo2 = vstup.nextInt();

        int sucet = cislo1 + cislo2;
        int sucin = cislo1 * cislo2;
        int rozdiel = cislo1 - cislo2;
        int podiel = cislo1 / cislo2;
        int zvysok = cislo1 % cislo2;

        System.out.println(cislo1 + " + " + cislo2 + " = " + sucet);
        System.out.println(cislo1 + " * " + cislo2 + " = " + sucin);
        System.out.println(cislo1 + " - " + cislo2 + " = " + rozdiel);
        System.out.println(cislo1 + " / " + cislo2 + " = " + podiel);
        System.out.println(cislo1 + " % " + cislo2 + " = " + zvysok);
    }

    //public static int getZvysok(int cislo1, int cislo2)
    //{
    //    int zvysok = cislo1 % cislo2;
    //    return zvysok;
    //}
//
    //public static int getPodiel(int cislo1, int cislo2)
    //{
    //    int podiel = cislo1 / cislo2;
    //    return podiel;
    //}
//
    //public static int getRozdiel(int cislo1, int cislo2)
    //{
    //    int rozdiel = cislo1 - cislo2;
    //    return rozdiel;
    //}
//
    //public static int getSucin(int cislo1, int cislo2)
    //{
    //    int sucin = cislo1 * cislo2;
    //    return sucin;
    //}
//
    //public static int getSucet(int cislo1, int cislo2)
    //{
    //    int sucet = cislo1 + cislo2;
    //    return sucet;
    //}
}

