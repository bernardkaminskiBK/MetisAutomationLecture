package java_spolocna_praca_s_lektorom.webinar23.Zadanie_23_2_3;

import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_3.Aplikacia;
import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_3.HlavneOkno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class Aplikacia3Test {
    HlavneOkno hlavneOkno = new HlavneOkno();

    @Test
    void getTitleOfJFrame()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.getTitle()).isEqualTo("Grafika 03");
            hlavneOkno.dispose();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void getSizeIsCorrect()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.getSize().height).isEqualTo(800);
            assertThat(hlavneOkno.getSize().width).isEqualTo(1200);
            hlavneOkno.dispose();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void isVisibleOrNot()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            Assertions.assertTrue(hlavneOkno.isVisible());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
