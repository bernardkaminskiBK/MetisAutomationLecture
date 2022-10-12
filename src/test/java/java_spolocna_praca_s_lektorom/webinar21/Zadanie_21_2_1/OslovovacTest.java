package java_spolocna_praca_s_lektorom.webinar21.Zadanie_21_2_1;

import java_spolocna_praca_s_lektorom.webinar21.zadanie_21_2_1.Oslovovac;
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
