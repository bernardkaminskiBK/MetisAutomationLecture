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
    @CsvSource(value = {"30,src/test/java/javazaklady/Zadanie_11_3_1_Test/text.txt",
            "151,src/test/java/javazaklady/Zadanie_11_3_1_Test/text2.txt",
            "605,src/test/java/javazaklady/Zadanie_11_3_1_Test/text3.txt",})
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
    @CsvSource(value = {"7,src/test/java/javazaklady/Zadanie_11_3_1_Test/text.txt",
            "25,src/test/java/javazaklady/Zadanie_11_3_1_Test/text2.txt",
            "106,src/test/java/javazaklady/Zadanie_11_3_1_Test/text3.txt"})
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
    @CsvSource(value = {"5,src/test/java/javazaklady/Zadanie_11_3_1_Test/text.txt",
            "2,src/test/java/javazaklady/Zadanie_11_3_1_Test/text2.txt",
            "9,src/test/java/javazaklady/Zadanie_11_3_1_Test/text3.txt"})
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
