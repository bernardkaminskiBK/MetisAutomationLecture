package academy.metis.javazaklady.lecture14.activity2.Zadanie_14_2_6;

import java.util.Random;

public class PoleUtil {

    private static Random generator = new Random();

    /**
     * Vygeneruje pole pseudonahodnych cisel o danej velkosti v rozsahu <dolnaHranica,hornaHranica>
     *
     * @param velkost      velkost pola na generovanie
     * @param dolnaHranica dolna hodnota generovanych cisel
     * @param hornaHranica horna hodnota generovanych cisel
     * @return pole pseudonahodnych cisel
     */
    public static int[] vygenerujPoleCisel(int velkost, int dolnaHranica, int hornaHranica) {
        int[] data = new int[velkost];

        for (int i = 0; i < data.length; i++) {
            data[i] = generator.nextInt(dolnaHranica, hornaHranica);
        }

        return data;
    }
}