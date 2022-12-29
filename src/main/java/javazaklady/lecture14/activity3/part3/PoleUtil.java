package javazaklady.lecture14.activity3.part3;

import java.util.Random;

public class PoleUtil {
    private static Random generator = new Random();

    /**
     * Vytvara pole s nahodnymi hodnotami
     * @param dlzka dlzka pola
     * @param hranica hranica hodnoty nahodneho cisla
     * @return nahodne vygenerovane pole o dlzke 0 a n -1
     */
    public static int[] vygenerujPoleCisel(int dlzka, int hranica){
        int[] a = new int[dlzka];
        for (int i = 0; i < a.length; i++){
            a[i] = generator.nextInt(hranica);
        }
        return a;
    }
}
