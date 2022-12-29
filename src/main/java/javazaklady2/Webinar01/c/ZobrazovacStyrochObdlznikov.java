package javazaklady2.Webinar01.c;

import java.awt.*;

public class ZobrazovacStyrochObdlznikov {
    public static void main(String[] args) {
        Rectangle obdlznik = new Rectangle(0, 0, 10, 5);
        System.out.println(obdlznik);

        posunObdlznik(obdlznik, 10, 0);
        System.out.println(obdlznik);

        posunObdlznik(obdlznik, -10, 5);
        System.out.println(obdlznik);

        posunObdlznik(obdlznik, 10, 0);
        System.out.println(obdlznik);
    }

    public static void posunObdlznik(Rectangle obdlznik, int x, int y) {
        obdlznik.translate(x, y);
    }

}
