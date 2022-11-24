package java_spolocna_praca_s_lektorom.Webinar24.Zadanie_24_2_1;

import javax.swing.*;

public class Aplikacia {

   public static JFrame okno;
    public static void main(String[] args) {

        Runnable lambda = () -> {

            okno = new JFrame();
            okno.setTitle("Grafika 01");
            okno.setSize(1200, 800);
            okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            okno.setVisible(true);
        };

        SwingUtilities.invokeLater(lambda);
    }
}
