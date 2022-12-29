package javazaklady2.Webinar11_Test.a_Test;

import javazaklady2.Webinar11.a.Statistiky;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


class StatistikyTest {
    private Statistiky statistiky;

    @BeforeEach
    public void setUp() {
        statistiky = new Statistiky();
    }

    @ParameterizedTest
    @CsvSource(value = {"30,TestFiles/text.txt",
            "151,TestFiles/text2.txt",
            "605,TestFiles/text3.txt"})
    void getPocetZnakovTest(int expectedResult, String filePath) {
        nacitaj(filePath);
        Assertions.assertEquals(expectedResult, statistiky.getPocetZnakov());
    }

    @ParameterizedTest
    @CsvSource(value = {"7,TestFiles/text.txt",
            "25,TestFiles/text2.txt",
            "106,TestFiles/text3.txt"})
    void getPocetSlovTest(int expectedResult, String filePath) {
        nacitaj(filePath);
        Assertions.assertEquals(expectedResult, statistiky.getPocetSlov());
    }

    @ParameterizedTest
    @CsvSource(value = {"5,TestFiles/text.txt",
            "2,TestFiles/text2.txt",
            "9,TestFiles/text3.txt"})
    void getPocetRiadkovTest(int expectedResult, String filePath) {
        nacitaj(filePath);
        Assertions.assertEquals(expectedResult, statistiky.getPocetRiadkov());
    }

    private void nacitaj(String filePath) {
        try {
            Scanner entryData = new Scanner(new FileReader(filePath));
            statistiky.citaj(entryData);

            entryData.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

}
