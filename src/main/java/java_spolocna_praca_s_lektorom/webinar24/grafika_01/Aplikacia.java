package java_spolocna_praca_s_lektorom.webinar24.grafika_01;

import javax.swing.*;

public class Aplikacia {
    public static void main(String[] args) {

        Runnable lambda = () -> {
            JFrame okno = new JFrame();

            okno.setTitle("Grafika 01");
            okno.setSize(1200, 800);
            okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            okno.setVisible(true);
        };

        SwingUtilities.invokeLater(lambda);
    }
}
