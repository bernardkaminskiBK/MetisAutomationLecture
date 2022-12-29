package javazaklady.lecture9.activity2.Zadanie_9_2_1;

public class SporiaciUcet extends BankovyUcet
{
    private double urokovaSadzba;

    // ak trieda neobsahuje ziadny konstruktor, automaticky sa
    // dogeneruje (je k dispozicii) tzv. defaultny bezparametricky
    // konstruktor public SporiaciUcet() {} . V tomto pripade vsaak musime
    // dorobit novy konstruktor - vid nizsie.

    public SporiaciUcet(double pociatocnyZostatok, double urokovaSadzba)
    {
        super(pociatocnyZostatok);
        this.urokovaSadzba = urokovaSadzba;
    }

    public void pripisUrok()
    {
        double urok = urokovaSadzba * getAktualnyZostatok() / 100; // nepriamo sme sa dostali
        // k aktualny zostatok cez getAktualnyZostatok(), lebo ten je private v nadtriede
        super.vloz(urok);
    }
}
