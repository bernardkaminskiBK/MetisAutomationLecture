package java_spolocna_praca_s_lektorom.webinar23.Zadanie23_2_1;

import java_spolocna_praca_s_lektorom.webinar23.zadanie_23_2_1.Aplikacia;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class AplikaciaTest {
//    static JFrame okno;

    // Moznost testovanie JFrame okna...
    @Test
    public void getTitleOfGUIJFrameWindow() {

        JFrame okno;

        try {
            Aplikacia.main(new String[0]);
            Thread.sleep(1000);
            okno = Aplikacia.okno;
            okno.setVisible(false);
            okno.dispose();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assertions.assertEquals("Grafika 01", okno.getTitle());
    }

    @Test
    void getSizeOfJFrameWindow() {
        JFrame okno;

        try {
            Aplikacia.main(new String[0]);
            Thread.sleep(1000);
            okno = Aplikacia.okno;
            okno.setVisible(true);
            okno.dispose();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Assertions.assertEquals(1200, okno.getSize().getWidth());
        assertThat(okno.getSize().height).isEqualTo(800);
    }


}
