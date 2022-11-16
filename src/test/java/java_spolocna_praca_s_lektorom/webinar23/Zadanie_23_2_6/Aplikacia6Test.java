package java_spolocna_praca_s_lektorom.webinar23.Zadanie_23_2_6;

import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_6.Aplikacia;
import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_6.HlavneOkno;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


public class Aplikacia6Test {

    HlavneOkno hlavneOkno = new HlavneOkno();

    @Test
    void getTitleOfJFrameTitle()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.getTitle()).isEqualTo("Grafika 06");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
