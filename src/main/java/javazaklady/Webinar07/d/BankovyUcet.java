package javazaklady.Webinar07.d;

public class BankovyUcet
{
    // instatncne premenne
    private double aktualnyZostatok;



    /**
     * Vytvara novy bankovy ucet s danym pociatocnym zostatkom podmienko minimalneho pociatocneho zostatku
     * @param pociatocnyZostatok suma penazi, ktora bude pripisana na bankovy ucet
     */
    public BankovyUcet(double pociatocnyZostatok)
    {
        assert pociatocnyZostatok > 0 : " pociatocny zostatok musi byt vacsi ako 0";
        aktualnyZostatok = pociatocnyZostatok;
    }



    /**
     * vklada danu ciatku na bankovy ucet s podminkou minimalneho vkladu
     * @param ciastka suma penazi, ktora sa pripise na bankovy ucet
     */
    public void vloz(double ciastka)
    {
        assert ciastka > 0 ;//: "vlozena ciastka musi byt vacsia ako 0";
        aktualnyZostatok = aktualnyZostatok + ciastka;
    }



    /**
     * vybera danu ciastku z bankoveho uctu s podmienkou ohranicujucou minimalneho a maximalneho vyberu
     * @param ciastka suma penazi, ktora bude odcitana z bankoveho uctu
     */
    public void vyber(double ciastka)
    {
     assert ciastka > 0 && ciastka < aktualnyZostatok : " vybrana ciastka musi byt vacsi ako 0 a sucasne mensi ako aktualny zostatok";


        aktualnyZostatok = aktualnyZostatok - ciastka;
    }



    /**
     * Vracia aktualny zostatok na bankovy ucet.
     * @return ciastka suma penazi
     */
    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }
}
