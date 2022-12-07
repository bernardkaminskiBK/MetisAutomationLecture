//package java_spolocna_praca_s_lektorom.webinar24.Zadanie_24_2_3;
//
//import java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_3.Aplikacia;
//import java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_3.HlavneOkno;
//import org.junit.jupiter.api.Test;
//import javax.swing.*;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.assertj.core.api.Assertions.*;
//
//public class Aplikacia3Test {
//
//    HlavneOkno hlavneOkno = new HlavneOkno();
//
//
//    @Test
//    void getNameOfJFrameTitle()
//    {
//        Aplikacia.main(new String[0]);
//        try {
//            Thread.sleep(100);
//            assertThat(hlavneOkno.getTitle()).isEqualTo("Grafika 03");
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    void isSizeOfJFrameCorrect()
//    {
//        Aplikacia.main(new String[0]);
//        try {
//            Thread.sleep(100);
//            assertThat(hlavneOkno.getSize().width).isEqualTo(1200);
//            assertThat(hlavneOkno.getSize().height).isEqualTo(800);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    void isDefaultCloseOperationCorrect()
//    {
//        Aplikacia.main(new String[0]);
//        try {
//            Thread.sleep(100);
//            assertThat(hlavneOkno.getDefaultCloseOperation()).isEqualTo(JFrame.EXIT_ON_CLOSE);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    void isBackgroundColorCorrect()
//    {
//        JTextArea textArea = new JTextArea();
//        Aplikacia.main(new String[0]);
//        try {
//            Thread.sleep(100);
//            textArea.setBackground(hlavneOkno.getBackground());
//            assertThat(textArea.getBackground()).isEqualTo(hlavneOkno.getBackground());
//
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Test
//    void isFontCorrect()
//    {
//        JTextArea textArea = new JTextArea();
//        Aplikacia.main(new String[0]);
//        try {
//            Thread.sleep(100);
//            textArea.setFont(hlavneOkno.getFont());
//            assertThat(textArea.getFont()).isEqualTo(hlavneOkno.getFont());
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//}
