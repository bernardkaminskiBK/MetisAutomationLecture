package java_spolocna_praca_s_lektorom.webinar05.Zadanie_5_2_4.b;

import java.util.ArrayList;
import java.util.Random;

public class Banka {
    public static void main(String[] args) {
        // Vytvor 100 bankovych uctov, pricom pociatocny zostatok bude generovany v
        // intervale od 100 do 1000 (pomocou cyklu do-while)
        int pocetUctov = 100;
        double nahodnyZostatok = 0;
        Random generator = new Random();
        BankovyUcet ucet;
        ArrayList<BankovyUcet> zoznam = new ArrayList<>();

        int i = 1;

        do
        {
            nahodnyZostatok = generator.nextDouble(100, 1001);
            ucet = new BankovyUcet(nahodnyZostatok);
            zoznam.add(ucet);
            i++;
        }
        while (i <= 100);

        System.out.println("Pocet uctov v banke: " + zoznam.size());
        vypisZostatky(zoznam);
    }

    private static void vypisZostatky(ArrayList<BankovyUcet> zoznam) {
        for (int i = 0; i < zoznam.size(); i++) {
            BankovyUcet ucet = zoznam.get(i);
            System.out.printf("Zostatok na %d. ucte: %.2f Eur%n", (i+1), ucet.getAktualnyZostatok());
        }
    }
}
