package academy.metis.profun.Lekcia10.part1;

import java.util.Scanner;

public class Hladac {

    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);

        int[] cisla = {1, 8, 3, 4, 50, 25, 30, 45, 80, 55};

        System.out.println("Zadaj cislo o ktorom si mysliš že sa nachadza v poli ");
        int cislo = vstup.nextInt();

        int nachadzaSa = vyhladajCislo(cisla, cislo);

        if (nachadzaSa != -1) {
            System.out.println("cislo sa nachadza na " + nachadzaSa + " pozici index [" + nachadzaSa + "]");
        } else {
            System.out.println(nachadzaSa);
        }
    }

    public static int vyhladajCislo(int[] cisla, int hladanecislo)
    {
        int pozicia = -1;
        for (int i = 0; i <= cisla.length - 1; i++)
        {
            pozicia = pozicia + 1;

            if (cisla[i] == hladanecislo)
            {
                return pozicia;
            }
        }
        return -1;
    }

}

//public class Hladac {
//
//    public static void main(String[] args) {
//        // TODO: doplnit...
//    }
//
//    public static int vyhladajCislo(int[] cisla, int velkostPola, int hladanecislo) {
//        // TODO: doplnit...
//        return -1;
//    }
//}
