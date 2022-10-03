package javazaklady.Zadanie_13_3_4_Test;


import javazaklady.Webinar13.Zadanie_13_3_4.TriedicZlucenim;
import javazaklady.Zadanie_13_3_4_Test.utils.StringArgumentProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.Arrays;

public class TriedicZlucenimTest {

    @ParameterizedTest
    @ArgumentsSource(StringArgumentProvider.class)
    public void triedicVyberomTest(String[] mockData, String[] expectedResults) {
        TriedicZlucenim triedic = new TriedicZlucenim(mockData);
        triedic.zotried();

        String actualResult = Arrays.toString(mockData);
        String expectedResult = Arrays.toString(expectedResults);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
