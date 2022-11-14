package java_spolocna_praca_s_lektorom.webinar23.Zadanie_23_2_2;

import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_2.Aplikacia;
import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_2.HlavneOkno;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import javax.swing.*;



public class Aplikacia2Test {
    HlavneOkno hlavneokno = new HlavneOkno();
    JTextArea txaText = new JTextArea();
    JButton btnKlikni = new JButton("Klik");

    @Test
    void getTitleofJFrame()
    {

        try {
            Aplikacia.main(new String[0]);
            Thread.sleep(500);
            hlavneokno.dispose();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals("Grafika 02", hlavneokno.getTitle());
    }

    @Test
    void getSizeOfJFrame()
    {
        try {
            Aplikacia.main(new String[0]);
            Thread.sleep(500);
            hlavneokno.dispose();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertThat(hlavneokno.getSize().width).isEqualTo(1200);
        Assertions.assertEquals(800, hlavneokno.getSize().height);

    }

    @Test
    void isVisibleOrNot()
    {
        try {
            Aplikacia.main(new String[0]);
            Thread.sleep(500);
            Assertions.assertTrue(hlavneokno.isVisible());
            hlavneokno.dispose();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
