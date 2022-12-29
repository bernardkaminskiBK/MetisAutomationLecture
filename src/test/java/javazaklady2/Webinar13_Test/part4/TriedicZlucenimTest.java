package javazaklady2.Webinar13_Test.part4;


import javazaklady.lecture13.activity3.part4.TriedicZlucenim;
import javazaklady2.Webinar13_Test.part4.utils.StringArgumentProvider;
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
