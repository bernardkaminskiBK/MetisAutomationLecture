//package java_spolocna_praca_s_lektorom.webinar24.Zadanie_24_2_1;
//
//import java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_1.Aplikacia;
//import org.junit.jupiter.api.Test;
//import javax.swing.*;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.assertj.core.api.Assertions.*;
//
//public class Aplikacia1Test {
//
//    @Test
//    void getNameOfJFrameTitle()
//    {
//        JFrame okno;
//
//        try {
//            Aplikacia.main(new String[0]);
//            Thread.sleep(500);
//            okno = Aplikacia.okno;
//            okno.dispose();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        assertEquals("Grafika 01", okno.getTitle());
//    }
//
//    @Test
//    void getSizeOfJFrame()
//    {
//        JFrame okno;
//
//        Aplikacia.main(new String[0]);
//        try {
//            Thread.sleep(100);
//            okno = Aplikacia.okno;
//            okno.dispose();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        assertThat(okno.getSize().height).isEqualTo(800);
//        assertThat(okno.getSize().width).isEqualTo(1200);
//    }
//
//    @Test
//    void setDefaultCloseOperationIsCorrect()
//    {
//        JFrame okno;
//
//        Aplikacia.main(new String[0]);
//        try {
//            Thread.sleep(100);
//            okno = Aplikacia.okno;
//            okno.dispose();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        assertThat(okno.getDefaultCloseOperation()).isEqualTo(JFrame.EXIT_ON_CLOSE);
//    }
//}

