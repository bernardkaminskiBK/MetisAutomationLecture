package java_spolocna_praca_s_lektorom.webinar22.Zadanie22_2_1;

import java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_1.Problem01Tester;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.StorePrintStream;
import static org.junit.jupiter.api.Assertions.*;


public class Problem01Test {

    @ParameterizedTest
    @CsvSource(value = {"0,Java", "1,Python", "2,C#"})
    void vypisTextTest(int get, String titul)
    {
        System.setOut(new StorePrintStream(System.out));
        Problem01Tester.main(new String[0]);
        assertTrue(StorePrintStream.printList.get(get).contains(titul));
    }

    @ParameterizedTest
    @CsvSource(value = {"Javascript", "HTML&CSS", "Java"})
    void vypisTextLambdaTest(String nazov)
    {
        VypisTextRozhranie vypis = System.out::println;
        vypis.vypisText(nazov);
    }


    @FunctionalInterface
    interface VypisTextRozhranie
    {
       void vypisText(String text);
    }
}
