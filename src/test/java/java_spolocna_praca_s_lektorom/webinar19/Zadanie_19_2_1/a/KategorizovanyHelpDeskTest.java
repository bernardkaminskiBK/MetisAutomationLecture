package java_spolocna_praca_s_lektorom.webinar19.Zadanie_19_2_1.a;

import java_spolocna_praca_s_lektorom.webinar19.zadanie_19_2_1.a.KategorizovanyHelpDesk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

import  static org.assertj.core.api.Assertions.*;

public class KategorizovanyHelpDeskTest {

    @Test
    void Test()
    {
        System.setOut(new StorePrintStream(System.out));
        KategorizovanyHelpDesk.main(new String[0]);
        Assertions.assertTrue(StorePrintStream.printList.get(0).contains("Nemam co robit, netyka sa ma to."));

    }
}
