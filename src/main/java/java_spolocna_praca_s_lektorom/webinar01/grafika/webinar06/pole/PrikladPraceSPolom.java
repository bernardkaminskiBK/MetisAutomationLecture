package java_spolocna_praca_s_lektorom.webinar01.grafika.webinar06.pole;

import java.io.File;
import java.util.Arrays;

public class PrikladPraceSPolom {
    public static void main(String[] args) {
        // deklaracia pola
        int[] cisla;
        File[] subory;
        String[] texty;
        double[] platy;

        // definicia pola
        cisla = new int[100];
        int[] cislaZamestnancov = { 1, 2, 3, 4, 5, 6 };
        // platy = { 1000, 2000, 3000 };
        platy = new double[1000];
        String[] mena = new String[] { "Peter", "Juraj", "Karol" };
        boolean[] vypinace = new boolean[10];
        char[] znaky = new char[10];    // \u0000
        String[] odbory = new String[5];
        double[] cisla2 = new double[5];

        // vypis prvky pola
        System.out.println(Arrays.toString(cisla));
        System.out.println(Arrays.toString(vypinace));
        System.out.println(Arrays.toString(znaky));
        System.out.println(Arrays.toString(odbory));
        System.out.println(Arrays.toString(cisla2));
        System.out.println(cisla2);
        System.out.println(cisla2);
    }
}
