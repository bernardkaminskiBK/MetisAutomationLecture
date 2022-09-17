package java_spolocna_praca_s_lektorom.webinar05.Zadanie_5_2_5;

import java_spolocna_praca_s_lektorom.webinar05.utils.StorePrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankaTest {

    @Test
    public void pocetUctovVBankeDoWhileTest() {
        System.setOut(new StorePrintStream(System.out));
        Banka.main(new String[0]);

        Assertions.assertTrue(StorePrintStream.printList.get(0).contains("100"));
    }

}
