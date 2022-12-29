package javazaklady2.Webinar08.d;

import java.util.Random;

public class Kocka {
    private int pocetStran;
    private int hodeneCislo;

    public Kocka(int pocetStran) {
        this.pocetStran = pocetStran;
    }

    public int hod() {
        Random generator = new Random();
        hodeneCislo = generator.nextInt(pocetStran) + 1;
        return hodeneCislo;
    }

    public int getHodeneCislo() {
        return hodeneCislo;
    }
}
