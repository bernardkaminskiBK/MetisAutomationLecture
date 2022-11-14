package java_spolocna_praca_s_lektorom.webinar23.Zadanie_23_2_2;

import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_2.Aplikacia;
import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_2.HlavneOkno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Aplikacia2Test {

    @Test
    void getTitleofJFrame()
    {
        HlavneOkno hlavneokno = new HlavneOkno();
        try {
            Aplikacia.main(new String[0]);
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("Grafika 02", hlavneokno.getTitle());
    }
}
