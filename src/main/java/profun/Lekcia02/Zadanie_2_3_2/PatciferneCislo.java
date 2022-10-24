package profun.Lekcia02.Zadanie_2_3_2;

import java.util.Scanner;

public class PatciferneCislo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj 5-ciferné číslo: ");

        int cislo = input.nextInt();

        System.out.println(pridajMedzery(cislo));

    }

    public static String pridajMedzery(int cislo) {

        String cisloString = String.valueOf(cislo);
        String vysledok = "";

        for (int i = 0; i < cisloString.length(); i++) {
            if (i<4){
                vysledok += cisloString.charAt(i) + "   ";
            }
        }
       return vysledok + cisloString.charAt(4);
    }

}
