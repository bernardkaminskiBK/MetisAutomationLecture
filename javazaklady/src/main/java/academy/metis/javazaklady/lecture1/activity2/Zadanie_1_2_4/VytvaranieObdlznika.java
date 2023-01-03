package academy.metis.javazaklady.lecture1.activity2.Zadanie_1_2_4;

import java.awt.*;

// Trieda odkaz = new Trieda();
// BankovyUcet ucet = new BankovyUcet();
// Aplikacia aplikacia = new Aplikacia();
public class VytvaranieObdlznika {

    public static String info;

    public static void main(String[] args) {
        // 1) vytvor objekt triedy Rectangle, kde x=0, y=0, width=0, height=0
        Rectangle obd1 = new Rectangle();
        ziskajInfo(obd1);

        // 2) vytvor objekt triedy Rectangle, kde width=100, height=100
        Rectangle obd2 = new Rectangle(100, 100);
        ziskajInfo(obd2);

        // 3) vytvor objekt triedy Rectangle, kde x=20, y=30, width=100, height=50
        Rectangle obd3 = new Rectangle(20, 30, 100, 50);
        ziskajInfo(obd3);

        // 4) vytvor objekt triedy Rectangle pomocou objektu typu Dimension
        Dimension rozmer = new Dimension(50, 60);
        Rectangle obd4 = new Rectangle(rozmer);
        ziskajInfo(obd4);

        // 5) vytvor objekt triedy Rectangle pomocou objektu typu Point
        Point umiestnenie = new Point(10, 20);
        Rectangle obd5 = new Rectangle(umiestnenie);
        ziskajInfo(obd5);

        // 6) vytvor objekt triedy Rectangle pomocou objektov Point a Dimension
        Rectangle obd6_a = new Rectangle(umiestnenie, rozmer);
        ziskajInfo(obd6_a);

        Point umiestnenie2 = new Point(300, 300);
        Dimension rozmer2 = new Dimension(200, 100);
        Rectangle obd6_b = new Rectangle(umiestnenie2, rozmer2);
        ziskajInfo(obd6_b);

        Rectangle obd6_c = new Rectangle(
                new Point(300, 300),
                new Dimension(200, 100)
        );
        ziskajInfo(obd6_c);

        // 7) vytvor objekt triedy Rectangle pomocou tzv. copy constructor
        Rectangle obd7 = new Rectangle(obd3);
        ziskajInfo(obd7);

        System.out.println(info);
    }

    public static void ziskajInfo(Rectangle obdlznik) {
        info += obdlznik + "\n";
    }
}