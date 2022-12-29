package javazaklady.lecture21.activity2.Zadanie_21_2_1;

import javazaklady.lecture21.activity2.Zadanie_21_2_1.Oslovovac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

public class OslovovacTest {

    @Test
    void oslovovacTest()
    {
        System.setOut(new StorePrintStream(System.out));
        Oslovovac.main(new String[0]);

        Assertions.assertTrue(StorePrintStream.printlnList.get(0).contains("Nazdar!"));
    }
}
