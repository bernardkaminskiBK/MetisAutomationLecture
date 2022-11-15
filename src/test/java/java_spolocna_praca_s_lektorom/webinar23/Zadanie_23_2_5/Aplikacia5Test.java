package java_spolocna_praca_s_lektorom.webinar23.Zadanie_23_2_5;

import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_5.Aplikacia;
import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_5.HlavneOkno;
import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_5.PanelNastrojov;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

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

    @Test
    void getSizeOfJFrame()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.getSize().width).isEqualTo(1200);
            assertThat(hlavneOkno.getSize().height).isEqualTo(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void isVisibleOrNotTest()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.isVisible()).isTrue();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void buttonTest()
    {
        JButton potvrd = new JButton("Potvrď");
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            PanelNastrojov panelNastrojov = new PanelNastrojov();
            panelNastrojov.add(potvrd);
            Assertions.assertEquals("Potvrď", potvrd.getText());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
