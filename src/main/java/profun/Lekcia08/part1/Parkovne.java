package profun.Lekcia08.part1;

import java.util.Locale;
import java.util.Scanner;


public class Parkovne {

    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);
        vstup.useLocale(Locale.ENGLISH);
        System.out.print("Zadaj pocet hodin parkovania pre 3 auta: ");
        double prveHodiny = vstup.nextDouble();
        double druheHodiny = vstup.nextDouble();
        double tretieHodiny = vstup.nextDouble();

        double prvePoplatky = spocitajPoplatky(prveHodiny);
        double druhePoplatky = spocitajPoplatky(druheHodiny);
        double tretiePoplatky = spocitajPoplatky(tretieHodiny);

        double celkoveHodiny = prveHodiny + druheHodiny + tretieHodiny;
        double celkovePoplatky = prvePoplatky + druhePoplatky + tretiePoplatky;

        System.out.print("Auto\t\tHodiny\t\tPoplatky\n");
        System.out.printf("1 %16.1f %13.2f \n", prveHodiny, prvePoplatky);
        System.out.printf("2 %16.1f %13.2f \n", druheHodiny, druhePoplatky);
        System.out.printf("3 %16.1f %13.2f \n", tretieHodiny, tretiePoplatky);
        System.out.printf("Spolu %12.1f %13.2f", celkoveHodiny, celkovePoplatky);
    }

    public static double spocitajPoplatky(double hodiny) {
        double poplatky = 0;

        if (hodiny <= 3) {
            poplatky = 2;
        } else if (hodiny >= 24) {
            poplatky = 10;
        } else {
            poplatky = 2 + ((hodiny - 3) * 0.5);
        }
        return poplatky;
    }

}
