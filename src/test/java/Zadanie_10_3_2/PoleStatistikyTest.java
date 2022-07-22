package Zadanie_10_3_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoleStatistikyTest {

    @Test
    public void statistikyTest() {
        String expectedResult =
                        "Minimum: 5\n" +
                        "Index min prvku: 2\n" +
                        "Maximum: 30\n" +
                        "Index max prvku: 4\n" +
                        "Priemer: 17.0";

        Assertions.assertEquals(expectedResult, PoleStatistiky.vygenerujStatistikyPola());
    }
}
