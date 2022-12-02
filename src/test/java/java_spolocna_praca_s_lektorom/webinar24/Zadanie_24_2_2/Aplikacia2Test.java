package java_spolocna_praca_s_lektorom.webinar24.Zadanie_24_2_2;

import java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_2.HlavneOkno;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class Aplikacia2Test {

    @Test
    void getNameOfJFrameTitle()
    {
        HlavneOkno okno = new HlavneOkno();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertEquals("Grafika 02", okno.getTitle());
    }

    
}
