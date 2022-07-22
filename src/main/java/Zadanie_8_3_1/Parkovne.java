package Zadanie_8_3_1;

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

        System.out.println(vypisDoKonzoly(prveHodiny, druheHodiny, tretieHodiny));
    }

    public static String vypisDoKonzoly(double prveHodiny, double druheHodiny, double tretieHodiny) {
        String vysledok = "";

        double prvePoplatky = spocitajPoplatky(prveHodiny);
        double druhePoplatky = spocitajPoplatky(druheHodiny);
        double tretiePoplatky = spocitajPoplatky(tretieHodiny);

        double celkoveHodiny = prveHodiny + druheHodiny + tretieHodiny;
        double celkovePoplatky = prvePoplatky + druhePoplatky + tretiePoplatky;

        vysledok = "Auto\t\tHodiny\t\tPoplatky\n";
        vysledok += "1\t\t\t" + prveHodiny + "\t\t\t" + prvePoplatky + "\n";
        vysledok += "2\t\t\t" + druheHodiny + "\t\t\t" + druhePoplatky + "\n";
        vysledok += "3\t\t\t" + tretieHodiny + "\t\t\t" + tretiePoplatky + "\n";
        vysledok += "Spolu:\t\t" + celkoveHodiny + "\t\t" + celkovePoplatky;

        return vysledok;
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
//}
//    public static void main(String[] args) {
//
//        Scanner vstup = new Scanner(System.in);
//        vstup.useLocale(Locale.ENGLISH);
//        System.out.print("Zadaj pocet hodin parkovania pre 3 auta: ");
//        double prveHodiny = vstup.nextDouble();
//        double druheHodiny = vstup.nextDouble();
//        double tretieHodiny = vstup.nextDouble();
//
//        double prvePoplatky = spocitajPoplatky(prveHodiny);
//        double druhePoplatky = spocitajPoplatky(druheHodiny);
//        double tretiePoplatky = spocitajPoplatky(tretieHodiny);
//
//        double celkoveHodiny = prveHodiny + druheHodiny + tretieHodiny;
//        double celkovePoplatky = prvePoplatky + druhePoplatky + tretiePoplatky;
//
//        System.out.print("Auto\t\tHodiny\t\tPoplatky\n");
//        System.out.printf("1 %16.1f %13.2f \n", prveHodiny, prvePoplatky);
//        System.out.printf("2 %16.1f %13.2f \n", druheHodiny, druhePoplatky);
//        System.out.printf("3 %16.1f %13.2f \n", tretieHodiny, tretiePoplatky);
//        System.out.printf("Spolu %12.1f %13.2f", celkoveHodiny, celkovePoplatky);
//    }
//
//    public static double spocitajPoplatky(double hodiny) {
//        double poplatky = 0;
//
//        if (hodiny <= 3) {
//            poplatky = 2;
//        } else if (hodiny >= 24) {
//            poplatky = 10;
//        } else {
//            poplatky = 2 + ((hodiny - 3) * 0.5);
//        }
//        return poplatky;
//    }
//}

//public class Parkovne {
//    public static void main(String[] args) {
//        // TODO: doplnit...
//    }
//
//    public static double spocitajPoplatky(double hodiny) {
//        double poplatky = 0;
//
//        // TODO: doplnit...
//
//        return poplatky;
//    }
//}
