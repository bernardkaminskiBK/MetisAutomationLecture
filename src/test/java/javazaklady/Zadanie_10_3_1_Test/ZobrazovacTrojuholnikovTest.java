package javazaklady.Zadanie_10_3_1_Test;

import javazaklady.Webinar10.Zadanie_10_3_1.ZobrazovacTrojuholnikov;
import javazaklady.Zadanie_10_3_1_Test.utils.CustomArgumentProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

class ZobrazovacTrojuholnikovTest {

    private ZobrazovacTrojuholnikov zt;

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class)
    void getVzorTrojuholnik1Test(String expectedResult, int velkost, String znak) {
        zt = new ZobrazovacTrojuholnikov(velkost, znak);
        Assertions.assertEquals(expectedResult.strip(), zt.getVzorTrojuholnik1().strip());
    }

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class)
    void getVzorTrojuholnik2Test(String expectedResult, int velkost, String znak) {
        zt = new ZobrazovacTrojuholnikov(velkost, znak);
        Assertions.assertEquals(expectedResult.strip(), zt.getVzorTrojuholnik2().strip());
    }

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class)
    void getVzorTrojuholnik3Test(String expectedResult, int velkost, String znak) {
        zt = new ZobrazovacTrojuholnikov(velkost, znak);
        Assertions.assertEquals(expectedResult.strip(), zt.getVzorTrojuholnik3().strip());
    }

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class)
    void getVzorTrojuholnik4Test(String expectedResult, int velkost, String znak) {
        zt = new ZobrazovacTrojuholnikov(velkost, znak);
        Assertions.assertEquals(expectedResult.strip(), zt.getVzorTrojuholnik4().strip());
    }

}
