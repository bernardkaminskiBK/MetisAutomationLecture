package java_spolocna_praca_s_lektorom.webinar23.Zadanie23_2_1;

import org.junit.jupiter.api.Test;
import javax.swing.*;

public class AplikaciaTest {
    static JFrame okno;
    @Test
    void oknoTest()
    {
        Runnable lambda = () -> {
            okno = new JFrame();

            okno.setTitle("Grafika 01");
            okno.setSize(1200, 800);
            okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            okno.setVisible(true);
        };

        SwingUtilities.invokeLater(lambda);

        try {
            Thread.sleep(2000);
            System.out.println(okno.getTitle());
            Thread.sleep(2000);
            okno.setVisible(false);
            okno.dispose();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
