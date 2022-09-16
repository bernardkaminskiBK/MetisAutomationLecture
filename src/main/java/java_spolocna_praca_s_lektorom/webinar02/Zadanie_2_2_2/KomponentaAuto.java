package java_spolocna_praca_s_lektorom.webinar02.Zadanie_2_2_2;

import javax.swing.*;
import java.awt.*;

public class KomponentaAuto extends JComponent {

    @Override
    protected void paintComponent(Graphics grafickyKontext) {
        Graphics2D g2 = (Graphics2D) grafickyKontext;

        Auto auto1 = new Auto(0, 0);
        auto1.vykresli(g2);

        Auto auto2 = new Auto(400, 0);
        auto2.vykresli(g2);

        Auto auto3 = new Auto(100, 300);
        auto3.vykresli(g2);

        Auto auto4 = new Auto(400, 150);
        auto4.vykresli(g2);
    }
}
