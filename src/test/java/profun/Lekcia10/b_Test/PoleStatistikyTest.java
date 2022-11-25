package profun.Lekcia10.b_Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import profun.Lekcia10.b.PoleStatistiky;


public class PoleStatistikyTest {

    @ParameterizedTest
    @CsvSource(value = {"10, 15, 5, 25, 30, 5, 2, 30, 4, 17", "-6, 5, 3, 91, -2, -6, 0, 91, 3, 18.2", "7, -3, 12, -15, 22, -15, 3, 22, 4, 4.6"})
    public void vygenerujStatistikyPolaTest(int firstInput, int secondInput, int thirdtInput, int fourthInput, int fifthInput,
                                            int expected1, int expected2, int expected3, int expected4, double expected5) {
        int[] pole = {firstInput, secondInput, thirdtInput, fourthInput, fifthInput};

        Assertions.assertEquals(expected1, PoleStatistiky.getMinimum(pole));
        Assertions.assertEquals(expected2, PoleStatistiky.getIndexMinimum(pole));
        Assertions.assertEquals(expected3, PoleStatistiky.getMaximum(pole));
        Assertions.assertEquals(expected4, PoleStatistiky.getIndexMaximum(pole));
        Assertions.assertEquals(expected5, PoleStatistiky.getPriemer(pole));

        /*
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
         */
    }
}