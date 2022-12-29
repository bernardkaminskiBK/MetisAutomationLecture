package javazaklady.lecture5.activity2.Zadanie_5_2_4.part1;

import javazaklady.lecture5.activity2.Zadanie_5_2_4.part1.Banka;
import utils.StorePrintStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankaTest {

    @Test
    public void pocetUctovVBankeDoWhileTest() {
        System.setOut(new StorePrintStream(System.out));
        Banka.main(new String[0]);

        assertTrue(StorePrintStream.printlnList.get(0).contains("100"));
        assertEquals(100, StorePrintStream.printfList.size());
    }

}
