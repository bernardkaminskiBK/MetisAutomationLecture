package javazaklady2.Webinar06.part1;

import java.util.ArrayList;

public class Banka
{
    private ArrayList <BankovyUcet> bankoveUcty;


    public Banka()
    {
        bankoveUcty = new ArrayList<>();
    }

    public void pridajUcet(BankovyUcet ucet)
    {
        bankoveUcty.add(ucet);
    }

    public double getCelkovyZostatok()
    {
        double celkovyZostatok = 0;

        for (BankovyUcet ucet : bankoveUcty)
        {
            celkovyZostatok += ucet.getAktualnyZostatok();
        }
        return celkovyZostatok;
    }

    public int vratPocetUctovSoZostatkomVacsimAko(double ciastka)
    {
        int pocetUctov = 0;

        for (BankovyUcet ucet : bankoveUcty)
        {
            if (ucet.getAktualnyZostatok() > ciastka)
                pocetUctov++;

        }
        return pocetUctov;
    }

    public BankovyUcet najdiUcet(int cisloUctu)
    {
        for (BankovyUcet ucet : bankoveUcty)
        {
            if (ucet.getCisloUctu() == cisloUctu)
            {
                return ucet;
            }
        }
        return null;
    }

    public BankovyUcet getMaximum()
    {
        if (bankoveUcty.size() == 0)
            return null;

        BankovyUcet maxZostatok = bankoveUcty.get(0);

        for (int i = 1; i < bankoveUcty.size(); i++)
        {
            BankovyUcet ucet = bankoveUcty.get(i);
            if (ucet.getAktualnyZostatok() > maxZostatok.getAktualnyZostatok())
                maxZostatok = ucet;
        }
        return maxZostatok;
    }

    public void pridajUcet(int cisloUctu, double zostatok)
    {
        BankovyUcet ucet = new BankovyUcet(cisloUctu, zostatok);
        bankoveUcty.add(ucet);
    }

    public void vloz(int cisloUctu, double ciastka)
    {
        BankovyUcet vyhladanyUcet = najdiUcet(cisloUctu);
        if (vyhladanyUcet == null)
            System.out.println("Cislo uctu sa nenaslo");
        vyhladanyUcet.vloz(ciastka);
    }

    public void vyber(int cisloUctu, double ciastka)
    {
        BankovyUcet vyhladanyUcet = najdiUcet(cisloUctu);
        if (vyhladanyUcet == null)
            System.out.println("Cislo uctu sa nenaslo");
        vyhladanyUcet.vyber(ciastka);
    }

    public double getAktualnyZostatok(int cisloUctu)
    {
        BankovyUcet vyhladanyUcet = najdiUcet(cisloUctu);
        return vyhladanyUcet.getAktualnyZostatok();
    }

    public ArrayList<BankovyUcet> getBankoveUcty() {
        return bankoveUcty;
    }
}
