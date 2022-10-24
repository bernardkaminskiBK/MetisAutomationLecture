package javazaklady.Webinar03_Test.b_Test;

import javazaklady.Webinar03_Test.b_Test.CustomAnnotations.ArraySource;
import javazaklady.Webinar03.b.Pokladna;
import javazaklady.Webinar03_Test.b_Test.CustomAnnotations.ArraySources;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokladnaTest {

    @ParameterizedTest
    @ArraySources(
            arrays = {
                    @ArraySource(array = {1.5, 5.2, 2.3, 25.2}),
                    @ArraySource(array = {3.4, 2.5, 6.0, 45.99, 100.00}),
                    @ArraySource(array = {5.70, 8, 9.5})
            }
    )
    void getPocetTovarovTest(double[] arrayOfPrizes) {
        Pokladna pokladna = new Pokladna();

        Arrays.stream(arrayOfPrizes).forEach(pokladna::naskenujTovar);
        int expectedResult = arrayOfPrizes.length;

        assertEquals(expectedResult, pokladna.getPocetTovarov());
    }

}
