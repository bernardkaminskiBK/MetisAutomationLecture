package profun.Lekcia10.part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PoleStatistikyTest {

    private int minimum = Integer.MAX_VALUE;
    private int maximum = Integer.MIN_VALUE;
    private int minIndex = 0;
    private int maxIndex = 0;
    private double sucet = 0;

    @Test
    public void vygenerujStatistikyPolaTest() {
        int[] pole = {10, 15, 5, 25, 30};

        vygenerujStatistikyPolaHelper(pole);

        PoleStatistiky.vygenerujStatistikyPola(pole);
        Assertions.assertEquals(minimum, PoleStatistiky.minimum);
        Assertions.assertEquals(minIndex, PoleStatistiky.minIndex);
        Assertions.assertEquals(maximum, PoleStatistiky.maximum);
        Assertions.assertEquals(maxIndex, PoleStatistiky.maxIndex);
        Assertions.assertEquals(sucet / pole.length, PoleStatistiky.sucet / pole.length);
    }

    private void vygenerujStatistikyPolaHelper(int[] pole) {
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] < minimum) {
                minimum = pole[i];
                minIndex = i;
            }
            if (pole[i] > maximum) {
                maximum = pole[i];
                maxIndex = i;
            }
            sucet += pole[i];
        }
    }
}
