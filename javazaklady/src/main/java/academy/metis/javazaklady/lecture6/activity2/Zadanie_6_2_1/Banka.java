package academy.metis.javazaklady.lecture6.activity2.Zadanie_6_2_1;

import java.util.ArrayList;

public class Banka {

    private ArrayList<BankovyUcet> zoznamUctov;

    public Banka()
    {
        zoznamUctov = new ArrayList<>();
    }

    public void zalozUcet(BankovyUcet ucet) {
        zoznamUctov.add(ucet);
    }

    public int getPocetUctov() {
        return zoznamUctov.size();
    }

    public void zmazUcet(int cisloUctu) {
        BankovyUcet vyhladanyUcet = vyhladajUcet(cisloUctu);

        if (vyhladanyUcet == null) {
            System.out.println("Neexistujuci ucet s cislom uctu: " + cisloUctu);
        }
        else {
            zoznamUctov.remove(vyhladanyUcet);
        }
    }

    public BankovyUcet vyhladajUcet(int cisloUctu) {
        for (BankovyUcet ucet : zoznamUctov) {
            if (ucet.getCisloUctu() == cisloUctu)
            {
                return ucet;
            }
        }

        return null;
    }

    public double getCelkovyZostatok() {
        double celkovyZostatok = 0;

        for (BankovyUcet ucet : zoznamUctov)
        {
            celkovyZostatok += ucet.getAktualnyZostatok();
        }

        return celkovyZostatok;
    }

    public int najdiPocetUctovSoZostatkomVyssimAko(double prinajmensom) {
        int pocetUctov = 0;

        for (BankovyUcet ucet : zoznamUctov) {
            if (ucet.getAktualnyZostatok() >= prinajmensom) {
                pocetUctov++;
            }
        }

        return pocetUctov;
    }

    public BankovyUcet najdiMaxUcet() {
        BankovyUcet maximum = zoznamUctov.get(0);

        for (int i = 1; i < zoznamUctov.size(); i++) {
            BankovyUcet ucet = zoznamUctov.get(i);

            if (ucet.getAktualnyZostatok() > maximum.getAktualnyZostatok()) {
                maximum = ucet;
            }
        }

        return maximum;
    }
}
