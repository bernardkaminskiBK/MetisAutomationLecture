package profun.Lekcia02.b;

import java.util.Scanner;

public class PatciferneCislo
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("zadaj 5-ciferne cislo:");
        int cislo = vstup.nextInt();

        int cislo1 = cislo % 10;
        int cislo2 = cislo / 10;
        int cislo10 = cislo2 % 10;
        int cislo3 = cislo2 / 10;
        int cislo100 = cislo3 % 10;
        int cislo4 = cislo3 / 10;
        int cislo1000 = cislo4 % 10;
        int cislo5 = cislo4 / 10;
        int cislo10000 = cislo5 % 10;

        System.out.println(cislo10000 + "   " + cislo1000 + "   " + cislo100 + "   " + cislo10 + "   " + cislo1);
    }

//    public static String pridajMedzery(int cislo) {
//
//        String cisloString = String.valueOf(cislo);
//        String vysledok = "";
//
//        for (int i = 0; i < cisloString.length(); i++) {
//            if (i<4){
//                vysledok += cisloString.charAt(i) + "   ";
//            }
//        }
//       return vysledok + cisloString.charAt(4);
//    }

}
