package javazaklady.lecture5.activity2.Zadanie_5_2_4.part2;

import javazaklady.lecture5.activity2.Zadanie_5_2_4.part2.Banka;
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