package javazaklady2.Webinar02.part3;

/**
 *  Sporiaci ucet ma zostatok, ktory moze byt zmeneny pomocou vkladov a vyberov.
 */
public class SporiaciUcet
{

    private double urokovaSadzba;
    private double aktualnyZostatok;

    /**
     * Vytvara sporiaci ucet s nulovym pociatocnym zostatkom.
     */
    public SporiaciUcet()
    {
        aktualnyZostatok = 0;
        urokovaSadzba = 0;
    }

    /**
     * Vytvara sporiaci ucet s danym pociatocnym zostatkom a urokovou sadzbou
     * @param pociatocnyZostatok
     * @param novaUrokovaSadzba
     */
    public SporiaciUcet(double pociatocnyZostatok, double novaUrokovaSadzba)
    {
        aktualnyZostatok = pociatocnyZostatok;
        urokovaSadzba = novaUrokovaSadzba;
    }

    /**
     * Pripiocita urok k aktualnemu zostatku
     */
    public void pripisUrok()
    {
        aktualnyZostatok = aktualnyZostatok + ((aktualnyZostatok / 100) * urokovaSadzba);
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
