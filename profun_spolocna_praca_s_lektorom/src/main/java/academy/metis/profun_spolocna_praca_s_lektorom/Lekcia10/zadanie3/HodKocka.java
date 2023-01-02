package academy.metis.profun_spolocna_praca_s_lektorom.Lekcia10.zadanie3;

import java.util.Random;

public class HodKocka {
    public static void main(String[] args) {
        Random generator = new Random();

        int[] sucty = new int[13];
        int[] ocakavaneHodnoty = {0, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        int cislo1;
        int cislo2;

        for (int i = 1; i < 36000; i++) {
            cislo1 = generator.nextInt(6) + 1;
            cislo2 = generator.nextInt(6) + 1;
            int sucet = cislo1 + cislo2;
            sucty[sucet]++;
        }

        System.out.printf("%10s%11s%11s%10s\n", "sucet", "cel.sucet", "ocakavana", "skutocna");

        for (int i = 2; i <= 12; i++) {
            System.out.printf("%10d%11d%11.3f%10.3f\n", i, sucty[i], 100.0 * ocakavaneHodnoty[i] / 36, 100.0 * sucty[i] / 36000);
        }
    }
}
