package java_spolocna_praca_s_lektorom.webinar10.Zadanie_10_2_2;

import java_spolocna_praca_s_lektorom.webinar10.zadanie_10_2_2.KomponentaJFileChooserDemo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

public class KomponentaJFileChooserTest {

    @Test
    void komponentaTest() {
        System.setOut(new StorePrintStream(System.out));
        KomponentaJFileChooserDemo.main(new String[0]);

        Assertions.assertTrue(StorePrintStream.printList.get(0).contains("Zvolil si subor:"));
    }
}
