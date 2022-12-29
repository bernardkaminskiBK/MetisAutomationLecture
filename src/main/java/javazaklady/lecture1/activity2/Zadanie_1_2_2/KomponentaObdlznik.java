package javazaklady.lecture1.activity2.Zadanie_1_2_2;

import javax.swing.*;
import java.awt.*;

public class KomponentaObdlznik extends JComponent {

    @Override
    protected void paintComponent(Graphics grafickyKontext) {
        Graphics2D g2 = (Graphics2D)grafickyKontext;

        Rectangle obdlznik = new Rectangle(100, 100, 200, 100);
        // grafickyKontext.drawRect(100, 100, 200, 100);

        // g2.draw(obdlznik);      // draw -> vykrelsi obrys objektu
        g2.fill(obdlznik);      // fill -> vykresli vnutro objektu

        obdlznik.translate(100, 100);

        g2.setColor(Color.red);
        g2.fill(obdlznik);
    }
}
