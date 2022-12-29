package javazaklady2.Webinar02.a;

/**
 * Bankovy ucet obsahuje zostatok na ucte, ktory moze byt zmeneny vkladmi a
 * vybermi.
 */
public class BankovyUcet
{
    private double aktualnyZostatok;

    /**
     * Vytvara bankovy ucet s nulovym pociatocnym zostatkom.
     */
    public BankovyUcet()
    {
        aktualnyZostatok = 0;
    }

    /**
     * Vytvara bankovy ucet s danym pociatocnym zostatkom.
     *
     * @param pociatocnyZostatok pociatocny zostatok
     */
    public BankovyUcet(double pociatocnyZostatok)
    {
        aktualnyZostatok = pociatocnyZostatok;
    }

    /**
     * Vklada danu sumu penazi na bankovy ucet.
     *
     * @param ciastka suma penazi, ktora bude pripisana na ucet
     */
    public void vloz(double ciastka)
    {
        aktualnyZostatok = aktualnyZostatok + ciastka;
    }

    /**
     * Vybera danu sumu penazi z bankoveho uctu.
     *
     * @param ciastka suma penazi, ktora sa z uctu vyberie
     */
    public void vyber(double ciastka)
    {
        aktualnyZostatok = aktualnyZostatok - ciastka;
    }

    /**
     * Vracia aktualny zostatok na bankovom ucte.
     *
     * @return aktualny zostatok na bankovom ucte
     */
    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }
}
