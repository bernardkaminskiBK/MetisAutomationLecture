package javazaklady.Webinar07.b;

//Hubay
public class Pokladna
{
    public final double prijataHotovost;
    private double cenaNacitanychTovarov;
    double cenaTovaru, hotovost, vydavok;
    private boolean spocitanyVydavok = true;
    int dostatocnaHotovost;

    /**
     * vytvara pokladnu s nulovyymi pociatocnymi hodnotami
     */
    public Pokladna()
    {
        prijataHotovost = 0;
        cenaNacitanychTovarov = 0;
    }

    /**
     * nacita cenu tovaru a pripocita k celkovim naskenovanym cenam tovarov
     * @param cenaTovaru cena naskenovaneho tovaru
     */
    public void nacitajTovar(double cenaTovaru)
    {
        this.cenaTovaru = cenaTovaru;
        cenaNacitanychTovarov = cenaNacitanychTovarov + cenaTovaru;
    }

    /**
     * prijima pocet minci s danou hodnoutou a spocita
     * @param pocet pocet prijatych minci
     * @param typMince hodnota prijatej mince
     */
    public void prijmiHotovost(int pocet, Minca typMince)
    {
        hotovost = hotovost + (pocet * typMince.getHodnota());
    }

    /**
     * zisti ci je dostatocna prijata hotovost a vypocita pocet konkertnej mince podla vydavku
     * @param typMince hodnota danej mince
     * @return vracia pocet danej mince
     */
    public int datVydavok(Minca typMince)
    {
        if (hotovost < cenaNacitanychTovarov)
        {
            return dostatocnaHotovost = -1;
        }

        if (spocitanyVydavok)
        {
            vydavok = hotovost - cenaNacitanychTovarov;
            vydavok = zaokruhli();
            spocitanyVydavok = false;
        }

        int pocetMinci = 0;

        while (vydavok - typMince.getHodnota() >= 0)
        {
            vydavok = vydavok - typMince.getHodnota();
            vydavok = zaokruhli();
            pocetMinci++;
        }
        return pocetMinci;
    }

    /**
     * zaokruhluje vydavok na dve desatinne miesta
     * @return vracia zaokruhleny vydavok
     */
    private double zaokruhli()
    {
        double zaokruhlenie = Math.round(vydavok * 100);
        return zaokruhlenie / 100;
    }
}
