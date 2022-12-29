package javazaklady.lecture23.activity2.Zadanie_23_2_6;

import javazaklady.lecture23.activity2.Zadanie_23_2_6.Aplikacia;
import javazaklady.lecture23.activity2.Zadanie_23_2_6.HlavneOkno;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import static org.assertj.core.api.Assertions.*;



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

    @Test
    void getSizeOfJFrame()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.getSize().width).isEqualTo(1200);
            assertThat(hlavneOkno.getSize().height).isEqualTo(800);
            hlavneOkno.dispose();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void isVisibleTest()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.isVisible()).isTrue();
            hlavneOkno.dispose();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void closeOprationTest()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.getDefaultCloseOperation()).isEqualTo(JFrame.EXIT_ON_CLOSE);
            hlavneOkno.dispose();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}