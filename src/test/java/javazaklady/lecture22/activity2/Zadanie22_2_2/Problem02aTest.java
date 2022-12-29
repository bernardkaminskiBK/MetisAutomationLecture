package javazaklady.lecture22.activity2.Zadanie22_2_2;

import javazaklady.lecture22.activity2.Zadanie_22_2_2.Problem02aTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.StorePrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class Problem02aTest {
    @Test
    void reverzTest()
    {
        System.setOut(new StorePrintStream(System.out));
        Problem02aTester.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("Programovanie v Jave nas bavi :-)"));
        assertTrue(StorePrintStream.printlnList.get(1).contains("einavomargorP v evaJ san ivab )-:"));
    }

    @ParameterizedTest
    @CsvSource(value = {"Programovanie v Jave nas bavi :-),einavomargorP v evaJ san ivab )-:"})
    void otocTextTest(String text, String exceptedResult)
    {
        ReverznyTyp revers = (String retazec) ->
        {
            StringBuilder otocenyText = new StringBuilder();
            for (String otocene: retazec.split(" "))
            {
                otocenyText.append(new StringBuilder(otocene).reverse()).append(" ");
            }
            return otocenyText.substring(0, otocenyText.length()-1);
        };
        String actualResult = revers.otoc(text);

        assertEquals(exceptedResult,actualResult);
    }
    @FunctionalInterface
    interface ReverznyTyp
    {
        String otoc(String retazec);
    }
}
