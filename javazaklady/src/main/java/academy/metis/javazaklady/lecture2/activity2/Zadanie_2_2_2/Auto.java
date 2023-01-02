package academy.metis.javazaklady.lecture2.activity2.Zadanie_2_2_2;

import java.awt.*;

public class Auto {
    private int x, y;

    public Auto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void vykresli(Graphics2D grafickyKontext)
    {
        // predne koleso
        grafickyKontext.fillOval(x + 10, y + 20, 10, 10);

        // zadne koleso
        grafickyKontext.fillOval(x + 40, y + 20, 10, 10);

        // trup auta
        grafickyKontext.fillRect(x, y + 10, 60, 10);

        // celne sklo
        grafickyKontext.drawLine(x + 10, y + 10, x + 20, y);

        // strecha
        grafickyKontext.drawLine(x + 20, y, x + 40, y);

        // zadne sklo
        grafickyKontext.drawLine(x + 40, y, x + 50, y + 10);
    }
}
