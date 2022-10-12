package java_spolocna_praca_s_lektorom.webinar21.Zadanie_21_2_5;

import java_spolocna_praca_s_lektorom.webinar21.zadanie_21_2_5.SucetPodielTester;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class SucetPodielTest {

    @Test
    void sucetPodielConsoleTest()
    {
        System.setOut(new StorePrintStream(System.out));
        SucetPodielTester.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("Sucet: 30"));
        assertEquals(2,StorePrintStream.printlnList.size());
    }
}
