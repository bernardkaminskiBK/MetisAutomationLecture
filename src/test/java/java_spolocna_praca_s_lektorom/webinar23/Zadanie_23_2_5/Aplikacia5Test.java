package java_spolocna_praca_s_lektorom.webinar23.Zadanie_23_2_5;

import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_5.Aplikacia;
import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_5.HlavneOkno;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class Aplikacia5Test {
    HlavneOkno hlavneOkno = new HlavneOkno();

    @Test
    void getTitleOfJFrame()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.getTitle()).isEqualTo("Grafika 05");
            hlavneOkno.dispose();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
