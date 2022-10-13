package java_spolocna_praca_s_lektorom.webinar22.Zadanie22_2_2;

import java_spolocna_praca_s_lektorom.webinar22.Zadanie_22_2_2.Problem02aTester;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class Problem02aTest {
    @Test
    void reverTest()
    {
        System.setOut(new StorePrintStream(System.out));
        Problem02aTester.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("Programovanie v Jave nas bavi :-)"));
        assertTrue(StorePrintStream.printlnList.get(0).contains("einavomargorP v evaJ san ivab )-:"));
    }
}
