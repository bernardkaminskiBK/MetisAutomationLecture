package academy.metis.javazaklady.lecture12.activity2.Zadanie_12_2_2;

public class Bankomat
{
    public static final int START = 1;
    public static final int PIN = 2;
    public static final int UCET = 3;
    public static final int TRANSAKCIA = 4;
    public static final int ZLYPIN = 5;
    public static int BEZNY = 1;
    public static int SPORIACI = 2;
    private final Banka banka;
    private int stav;
    private int klientskeCislo;
    private BankovyUcet aktualnyUcet;
    private int pin;
    public static int typUctu;
    private Klient aktualnyKlient;

    public Bankomat(Banka banka)
    {
        this.banka = banka;
        reset();
    }

    public int getStav()
    {
        return stav;
    }

    public void nastavKlientskeCislo(int klientskeCislo)
    {
        assert stav == START;
        this.klientskeCislo = klientskeCislo;
        stav = PIN;
    }

    public void nastavKlienta(int pin)
    {
        assert stav == pin;

        this.aktualnyKlient = banka.vyhladajKlienta(klientskeCislo, pin);

        if (aktualnyKlient == null)
        {
            stav = ZLYPIN;
        }
        else
        {
            stav = UCET;
        }
    }

    public void nastavTypUctu(int typUctu)
    {
        assert stav == UCET || stav == TRANSAKCIA;

        this.typUctu = typUctu;

        if (typUctu == BEZNY)
        {
            this.aktualnyUcet = aktualnyKlient.getBeznyUcet();
        }
        else
        {
            this.aktualnyUcet = aktualnyKlient.getSporiaciUcet();
        }
        stav = TRANSAKCIA;
    }

    public void vyber(double ciastka)
    {
        assert stav == TRANSAKCIA;
        this.aktualnyUcet.vyber(ciastka);
    }

    public void vloz(double ciastka)
    {
        assert stav == TRANSAKCIA;
        this.aktualnyUcet.vloz(ciastka);
    }

    public double getAktualnyZostatok()
    {
        assert stav == TRANSAKCIA;
        return this.aktualnyUcet.getAktualnyZostatok();
    }

    public void nastavPredchadzajuciStav()
    {
        if (stav == TRANSAKCIA)
        {
            stav = UCET;
        }
        else if (stav == UCET)
        {
            stav = PIN;
        }
        else if (stav == PIN)
        {
            stav = START;
        }
    }

    public void reset()
    {
        klientskeCislo = -1;
        aktualnyUcet = null;
        stav = START;
    }
}
