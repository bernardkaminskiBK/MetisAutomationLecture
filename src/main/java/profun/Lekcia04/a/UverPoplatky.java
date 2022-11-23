package profun.Lekcia04.a;

import java.util.Scanner;
public class UverPoplatky
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadaj vysku uveru (-1 pre ukoncenie): ");
        double vyskaUveru = vstup.nextInt();

        double urokovaSadzba;
        double obdobieViazanosti;

        while (vyskaUveru != -1)
        {
            System.out.println("Zadaj vysku urokovej sadzby:");
            urokovaSadzba = vstup.nextDouble();
            System.out.println("Zadaj obdobie viazanosti v dnoch:");
            obdobieViazanosti = vstup.nextDouble();

            double poplatky = vyskaUveru * urokovaSadzba * (obdobieViazanosti / 365);

            System.out.println("Poplatky za uver su: " + poplatky + "\n");

            System.out.println("Zadaj vysku uveru (-1 pre ukoncenie): ");
            vyskaUveru = vstup.nextInt();
        }
    }

    //public static double vyratajUrokovuSadzbu(double vyskaUveru, double urokovaSadzba, double obdobieViazanosti) {
    //    return vyskaUveru * urokovaSadzba * (obdobieViazanosti / 365);
    //}
}


