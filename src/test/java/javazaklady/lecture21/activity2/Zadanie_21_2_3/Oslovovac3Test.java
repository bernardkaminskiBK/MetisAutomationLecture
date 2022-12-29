package javazaklady.lecture21.activity2.Zadanie_21_2_3;

import javazaklady.lecture21.activity2.Zadanie_21_2_3.Oslovovac3;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class Oslovovac3Test {

    @Test
    void oslovovac3Test()
    {
        System.setOut(new StorePrintStream(System.out));
        Oslovovac3.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("Ahoj!"));
        assertTrue(StorePrintStream.printlnList.get(1).contains("Nazdar!"));
        assertTrue(StorePrintStream.printlnList.get(2).contains("Dobry den!"));
        assertEquals(3, StorePrintStream.printlnList.size());

    }
}
