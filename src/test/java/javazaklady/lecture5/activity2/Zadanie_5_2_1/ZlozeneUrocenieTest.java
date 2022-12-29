package javazaklady.lecture5.activity2.Zadanie_5_2_1;


import javazaklady.lecture5.activity2.Zadanie_5_2_1.ZlozeneUrocenie;
import org.junit.jupiter.api.Test;
import utils.StorePrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZlozeneUrocenieTest {

    @Test
    public void zlozeneUrocenieTest() {
        System.setOut(new StorePrintStream(System.out));
        ZlozeneUrocenie.main(new String[0]);

        assertEquals(16, StorePrintStream.printfList.size());

        double zostatok;
        double pociatocnyZostatok = 1000;
        double urokovaSadzba = 0.03;

        for (int rok = 1; rok <= 15; rok++)
        {
            zostatok = pociatocnyZostatok * Math.pow(1 + urokovaSadzba, rok);
            assertTrue(StorePrintStream.printfList.get(rok).contains(String.valueOf(zostatok)));
        }
    }
}
