package java_spolocna_praca_s_lektorom.webinar05.Zadanie_5_2_4.c_Test;

import java_spolocna_praca_s_lektorom.webinar05.Zadanie_5_2_4.c.Banka;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BankaTest {

    @Test
    public void pocetUctovVBankeDoWhileTest() {
        System.setOut(new StorePrintStream(System.out));
        Banka.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("100"));
        assertEquals(100, StorePrintStream.printfList.size());
    }

}