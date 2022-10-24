package profun.Lekcia08.Zadanie_8_3_3;

import java.util.Scanner;

public class Nasobok {

//    public static void main(String[] args) {
//        //TODO: doplnit...
//    }
//
//    public static boolean jeDelitelne(int cislo1, int cislo2) {
//        //TODO: doplnit...
//        return //TODO: doplnit...;
//    }
//
//}

    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);

        System.out.print("Zadaj prve cislo: ");
        int cislo1 = vstup.nextInt();

        System.out.print("Zadaj druhe cislo: ");
        int cislo2 = vstup.nextInt();

        boolean vysledok = jeDelitelne(cislo1, cislo2);

        if (vysledok) {
            System.out.println("Cislo " + cislo2 + " je delitelne cislom " + cislo1);
        } else {
            System.out.println("Cislo " + cislo2 + " nie je delitelne cislom " + cislo1);
        }

    }

    public static boolean jeDelitelne(int X, int Y) {
        return Y % X == 0;
    }

}

