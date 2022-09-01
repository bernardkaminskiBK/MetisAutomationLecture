package javazaklady.Zadanie_11_3_1_Test;

import javazaklady.Zadanie_11_3_1.Statistiky;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


class StatistikyTest {
    private Statistiky statistiky;
    private FileReader fileReader;
    private Scanner entryData;

    @BeforeEach
    public void setUp() {
        statistiky = new Statistiky();
    }

    @ParameterizedTest
    @CsvSource(value = {"30,TestFiles/text.txt",
            "151,TestFiles/text2.txt",
            "605,TestFiles/text3.txt",})
    void getPocetZnakovTest(int expectedResult, String filePath) {
        try {
            fileReader = new FileReader(filePath);
            entryData = new Scanner(fileReader);

            statistiky.citaj(entryData);
            entryData.close();

            Assertions.assertEquals(expectedResult, statistiky.getPocetZnakov());
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    @ParameterizedTest
    @CsvSource(value = {"7,TestFiles/text.txt",
            "25,TestFiles/text2.txt",
            "106,TestFiles/text3.txt"})
    void getPocetSlovTest(int expectedResult, String filePath) {
        try {
            fileReader = new FileReader(filePath);
            entryData = new Scanner(fileReader);

            statistiky.citaj(entryData);
            entryData.close();

            Assertions.assertEquals(expectedResult, statistiky.getPocetSlov());
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    @ParameterizedTest
    @CsvSource(value = {"5,TestFiles/text.txt",
            "2,TestFiles/text2.txt",
            "9,TestFiles/text3.txt"})
    void getPocetRiadkovTest(int expectedResult, String filePath) {
        try {
            fileReader = new FileReader(filePath);
            entryData = new Scanner(fileReader);

            statistiky.citaj(entryData);
            entryData.close();

            Assertions.assertEquals(expectedResult, statistiky.getPocetRiadkov());
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

}
