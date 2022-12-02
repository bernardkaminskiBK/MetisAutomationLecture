package java_spolocna_praca_s_lektorom.webinar24.Zadanie_24_2_2;

import java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_2.Aplikacia;
import java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_2.HlavneOkno;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;


public class Aplikacia2Test {
    HlavneOkno hlavneOkno = new HlavneOkno();

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
    void isVisibleCorrect()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertTrue(hlavneOkno.isVisible());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void isBackgroundCorrect()
    {
        JTextArea txaText = new JTextArea();
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            hlavneOkno.setBackground(txaText.getBackground());
            assertThat(hlavneOkno.getBackground()).isEqualTo(txaText.getBackground());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }




}
