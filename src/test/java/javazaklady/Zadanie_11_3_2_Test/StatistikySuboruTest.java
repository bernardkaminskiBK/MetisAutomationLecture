package javazaklady.Zadanie_11_3_2_Test;

import javazaklady.Zadanie_11_3_1.Statistiky;
import javazaklady.Zadanie_11_3_2.StatistikySuboru;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


class StatistikySuboruTest {
    private StatistikySuboru statistiky;


//    @ParameterizedTest
//    @CsvSource(value = {"30,src/main/java/javazaklady/Zadanie_11_3_2_Test/text.txt",
//            "154,src/main/java/javazaklady/Zadanie_11_3_2_Test/text2.txt",
//            "621,src/main/java/javazaklady/Zadanie_11_3_2_Test/text3.txt",})
//    void getPocetZnakovTest(int expectedResult, String filePath) {
//        StatistikySuboru statistiky = new StatistikySuboru();
//
//        statistiky.nacitajSubory(filePath);
//
//        Assertions.assertEquals(expectedResult, statistiky.getPocetZnakov());
//    }

    @Test
    void getPocetZnakovTest() {
        statistiky = new StatistikySuboru();

        String textSrc1 = "src/test/java/javazaklady/Zadanie_11_3_2_Test/text.txt";
        String textSrc2 = "src/test/java/javazaklady/Zadanie_11_3_2_Test/text2.txt";
        String textSrc3 = "path of file does not exist...";

        statistiky.nacitajSubory(textSrc1);
        statistiky.nacitajSubory(textSrc2);
        statistiky.nacitajSubory(textSrc3);

        Assertions.assertEquals(181, statistiky.getPocetZnakov());
    }


//    @ParameterizedTest
//    @CsvSource(value = {"7,src/main/java/javazaklady/Zadanie_11_3_2_Test/text.txt",
//            "25,src/main/java/javazaklady/Zadanie_11_3_2_Test/text2.txt",
//            "104,src/main/java/javazaklady/Zadanie_11_3_2_Test/text3.txt"})
//    void getPocetSlovTest(int expectedResult, String filePath) {
//        try {
//            fileReader = new FileReader(filePath);
//            entryData = new Scanner(fileReader);
//
//            statistiky.citaj(entryData);
//            entryData.close();
//
//            Assertions.assertEquals(expectedResult, statistiky.getPocetSlov());
//        } catch (FileNotFoundException e) {
//            e.getMessage();
//        }
//    }

    @Test
    void getPocetSlovTest() {
        statistiky = new StatistikySuboru();

        String textSrc1 = "src/test/java/javazaklady/Zadanie_11_3_2_Test/text.txt";
        String textSrc2 = "path of file does not exist...";
        String textSrc3 = "path of file does not exist...";

        statistiky.nacitajSubory(textSrc1);
        statistiky.nacitajSubory(textSrc2);
        statistiky.nacitajSubory(textSrc3);

        Assertions.assertEquals(7, statistiky.getPocetSlov());
    }

//    @ParameterizedTest
//    @CsvSource(value = {"5,src/main/java/javazaklady/Zadanie_11_3_2_Test/text.txt",
//            "2,src/main/java/javazaklady/Zadanie_11_3_2_Test/text2.txt",
//            "9,src/main/java/javazaklady/Zadanie_11_3_2_Test/text3.txt"})
//    void getPocetRiadkovTest(int expectedResult, String filePath) {
//        try {
//            fileReader = new FileReader(filePath);
//            entryData = new Scanner(fileReader);
//
//            statistiky.citaj(entryData);
//            entryData.close();
//
//            Assertions.assertEquals(expectedResult, statistiky.getPocetRiadkov());
//        } catch (FileNotFoundException e) {
//            e.getMessage();
//        }
//    }
//

    @Test
    void getPocetRiadkovTest() {
        statistiky = new StatistikySuboru();

        String textSrc1 = "src/test/java/javazaklady/Zadanie_11_3_2_Test/text.txt";
        String textSrc2 = "src/test/java/javazaklady/Zadanie_11_3_2_Test/text2.txt";
        String textSrc3 = "src/test/java/javazaklady/Zadanie_11_3_2_Test/text3.txt";
        String textSrc4 = "path of file does not exist...";

        statistiky.nacitajSubory(textSrc1);
        statistiky.nacitajSubory(textSrc2);
        statistiky.nacitajSubory(textSrc3);
        statistiky.nacitajSubory(textSrc4);

        Assertions.assertEquals(16, statistiky.getPocetRiadkov());
    }
}
