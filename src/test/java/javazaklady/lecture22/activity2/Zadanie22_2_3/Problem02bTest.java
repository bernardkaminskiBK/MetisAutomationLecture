package javazaklady.lecture22.activity2.Zadanie22_2_3;

import javazaklady.lecture22.activity2.Zadanie_22_2_3.Problem02bTester;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import utils.StorePrintStream;
import java.util.function.Function;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Problem02bTest {

    @ParameterizedTest
    @CsvSource(value = {"Programovanie v Jave nas bavi :-),einavomargorP v evaJ san ivab )-:"})
    void otocTextTest(String text, String exceptedResult)
    {
        Function<String,String> revers = (String retazec) ->
        {
            StringBuilder otocenyText = new StringBuilder();
            for (String otocene: retazec.split(" "))
            {
                otocenyText.append(new StringBuilder(otocene).reverse()).append(" ");
            }
            return otocenyText.substring(0, otocenyText.length()-1);
        };
        String actualResult = revers.apply(text);

        assertEquals(exceptedResult,actualResult);
    }

    @Test
    void otocVypisTest()
    {
        System.setOut(new StorePrintStream(System.out));
        Problem02bTester.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("Programovanie v Jave nas bavi :-)"));
    }
}
