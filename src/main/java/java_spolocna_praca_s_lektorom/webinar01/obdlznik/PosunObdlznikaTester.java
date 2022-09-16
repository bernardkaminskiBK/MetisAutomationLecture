package java_spolocna_praca_s_lektorom.webinar01.obdlznik;

import java.awt.*;

// Trieda odkaz = new Trieda();
public class PosunObdlznikaTester {

    public static void main(String[] args) {
        // 1) vytvor obdlznik
        Rectangle obdlznik = new Rectangle(10, 20, 30, 40);

        // 2) vypis info o obdlzniku
        System.out.println("X: " + obdlznik.getX());
        System.out.println("Y: " + obdlznik.getY());
        System.out.println("Sirka: " + obdlznik.getWidth());
        System.out.println("Vyska: " + obdlznik.getHeight());

        // 3) posun obdlznik o 25 pixelov doprava a 35 pixelov nadol
        obdlznik.translate(25, 35);
        System.out.println("Posun obldznika o 25 pixelov doprava a 35 pixelov nadol");

        // 4) vypis info o obdlzniku
        System.out.println("X: " + obdlznik.getX());
        System.out.println("Y: " + obdlznik.getY());
        System.out.println("Sirka: " + obdlznik.getWidth());
        System.out.println("Vyska: " + obdlznik.getHeight());
    }
}
