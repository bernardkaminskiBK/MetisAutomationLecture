package Zadanie_8_3_2;

import java.util.Scanner;

public class Mocnina {
    public static void main(String[] args) {
        zobraz();
    }

    public static void zobraz() {
        Scanner vstup = new Scanner(System.in);
        System.out.print("Zadaj zaklad cisla a exponent: ");
        int cislo = vstup.nextInt();
        int exponent = vstup.nextInt();

        int mocnina = umocni(cislo, exponent);

        System.out.println(cislo + " umocnene na " + exponent + " je: " + mocnina);
    }

    public static int umocni(int cislo, int exponent) {
        int vysledok = 1;

        for (int i = 1; i <= exponent; i++) {
            vysledok = vysledok * cislo;
        }
        return vysledok;
    }
}

//public class Mocnina {
//    public static void main(String[] args) {
//        //TODO: doplnit
//    }
//
//    public static int umocni(int cislo, int exponent) {
//        int vysledok = 0;
//        //TODO: doplnit
//        return vysledok;
//    }
//}
