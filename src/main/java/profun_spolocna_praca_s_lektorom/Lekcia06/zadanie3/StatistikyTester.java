package profun_spolocna_praca_s_lektorom.Lekcia06.zadanie3;

import java.util.Scanner;

public class StatistikyTester {
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        int sucet = 0;
        int velkost = 0;
        int minimum = 0;
        int maximum = 0;
        int absMaximum = 0;

        System.out.print("zadaj velkost mnoziny dat ako kladne cele cislo: ");
        velkost = vstup.nextInt();

        for (int i = 1; i <= velkost; i++)
        {
            System.out.print("zadaj " + i + ". cislo: ");
            int cislo = vstup.nextInt();

            if (i == 1)
            {
                minimum = maximum = absMaximum = sucet = cislo;
            }
            else
            {
                sucet = sucet + cislo;

                if (cislo < minimum)
                {
                    minimum = cislo;
                }

                if (cislo > maximum)
                {
                    maximum = cislo;
                }

                if (Math.abs(cislo) > Math.abs(absMaximum))
                {
                    absMaximum = cislo;
                }
            }
        }
        System.out.println("\nsucet cisel je: " + sucet);
        System.out.println("minimum je: " + minimum);
        System.out.println("maximum je: " + maximum);
        System.out.println("maximum v absolutnej hodnote je: " + absMaximum);
    }

    //public static void generujStatistiky(Scanner vstup) {
    //    int sucet = 0;
    //    int velkost;
    //    int minium = 0;
    //    int maximum = 0;
    //    int absMaximum = 0;
//
    //    System.out.print("zadaj velkost mnoziny dat ako kladne cele cislo: ");
    //    velkost = vstup.nextInt();
//
    //    for (int i = 1; i <= velkost; i++) {
    //        System.out.print("zadaj " + i + ". cislo: ");
    //        int cislo = vstup.nextInt();
//
    //        if (i == 1) {
    //            minium = maximum = absMaximum = sucet = cislo;
    //        } else {
    //            minium = getMinium(minium, cislo);
    //            maximum = getMaximum(maximum, cislo);
    //            absMaximum = getAbsMaximum(absMaximum, cislo);
    //            sucet = getSucet(sucet, cislo);
    //        }
    //    }
    //    System.out.println("\nsucet cisel je: " + sucet);
    //    System.out.println("minimum je: " + minium);
    //    System.out.println("maximum je: " + maximum);
    //    System.out.println("maximum v absolutnej hodnote je: " + absMaximum);
    //}
//
    //private static int getSucet(int sucet, int cislo) {
    //    sucet = sucet + cislo;
    //    return sucet;
    //}
//
    //private static int getAbsMaximum(int absMaximum, int cislo) {
    //    if (Math.abs(cislo) > Math.abs(absMaximum)) {
    //        absMaximum = cislo;
    //    }
    //    return absMaximum;
    //}
//
    //private static int getMaximum(int maximum, int cislo) {
    //    if (cislo > maximum) {
    //        maximum = cislo;
    //    }
    //    return maximum;
    //}
//
    //private static int getMinium(int minimum, int cislo) {
    //    if (cislo < minimum) {
    //        minimum = cislo;
    //    }
    //    return minimum;
    //}
}
