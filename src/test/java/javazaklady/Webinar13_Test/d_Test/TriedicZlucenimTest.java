package javazaklady.Webinar13_Test.d_Test;


import javazaklady.Webinar13.d.TriedicZlucenim;
import javazaklady.Webinar13_Test.d_Test.utils.StringArgumentProvider;
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
