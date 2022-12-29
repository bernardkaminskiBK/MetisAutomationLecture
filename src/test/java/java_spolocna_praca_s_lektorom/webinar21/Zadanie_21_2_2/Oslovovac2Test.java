package java_spolocna_praca_s_lektorom.webinar21.Zadanie_21_2_2;

import static org.junit.jupiter.api.Assertions.*;

import javazaklady.lecture21.activity2.Zadanie_21_2_2.Oslovovac2;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

public class Oslovovac2Test {

    @Test
    void oslovovac2Test()
    {
        System.setOut(new StorePrintStream(System.out));
        Oslovovac2.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("Ahoj!"));
        assertTrue(StorePrintStream.printlnList.get(1).contains("Nazdar!"));
        assertTrue(StorePrintStream.printlnList.get(2).contains("Dobry den!"));
        assertEquals(3, StorePrintStream.printlnList.size());
    }
}
