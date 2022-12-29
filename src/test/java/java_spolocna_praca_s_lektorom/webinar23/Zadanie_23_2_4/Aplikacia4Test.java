package java_spolocna_praca_s_lektorom.webinar23.Zadanie_23_2_4;

import javazaklady.lecture23.activity2.Zadanie_23_2_4.Aplikacia;
import javazaklady.lecture23.activity2.Zadanie_23_2_4.HlavneOkno;
import javazaklady.lecture23.activity2.Zadanie_23_2_4.TextovyPanel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;


public class Aplikacia4Test {
    HlavneOkno hlavneOkno = new HlavneOkno();

    @Test
    void getTitleOfJFrame()
    {
        Aplikacia.main(new String[0]);
        try {
            Thread.sleep(100);
            assertThat(hlavneOkno.getTitle()).isEqualTo("Grafika 04");
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
            hlavneOkno.dispose();
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
            hlavneOkno.dispose();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @ParameterizedTest
    @CsvSource(value = {"Klikni", "Klikol", "Tlačidlo"})
    void addTextAppendTest(String text)
    {
        TextovyPanel txtPanel = new TextovyPanel();
        txtPanel.vlozText(text);
        assertThat(txtPanel).isNotNull();

    }
}
