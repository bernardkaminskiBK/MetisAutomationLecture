package javazaklady.lecture3.activity3.part1;

/**
 Pokladna nacitava tovary a nasledne vypocita vydavok.
 */
public class Pokladna
{
    private double celkovaPrijataHotovost;

    public double getCelkovaCenaTovarov() {
        return celkovaCenaTovarov;
    }

    private double celkovaCenaTovarov;

    private final static double HODNOTA_EUR_MINCE = 1.0;
    private final static double HODNOTA_50_CENT_MINCE = 0.5;
    private final static double HODNOTA_20_CENT_MINCE = 0.2;
    private final static double HODNOTA_10_CENT_MINCE = 0.10;
    private final static double HODNOTA_5_CENT_MINCE = 0.05;
    private final static double HODNOTA_2_CENT_MINCE = 0.02;
    private final static double HODNOTA_1_CENT_MINCE = 0.01;

    /**
     Vytvara novu pokladnu bez penazi.
     */
    public  Pokladna()
    {
        double prijataHotovost = 0;
        double NaskenovanychTovarov = 0;
    }

    /**
     * Skenuje prijate tovary
     * @param cena tovarov
     */
    public void naskenujTovar(double cena)
    {
        celkovaCenaTovarov += cena;
    }

    /**
     * Vracia vydavok na zaklade prijatej hotovosti
     * @return vracia vydavok
     */
    public double vratVydavok()
    {
        return  celkovaPrijataHotovost - celkovaCenaTovarov;
    }

    /**
     * Nastavuje fixnu hodnotu 1eur mince
     * @param pocetKusov pocet kusov 1 eur mince spolu
     */
    public void prijmyEura(int pocetKusov)
    {
        celkovaPrijataHotovost += (pocetKusov * HODNOTA_EUR_MINCE);
    }

    /**
     * Nastavuje fixnu hodnotu 50centovej mince
     * @param pocetKusov pocet 50centovej mince spolu
     */
    public void prijmy50Centovky(int pocetKusov)
    {
        celkovaPrijataHotovost += (pocetKusov * HODNOTA_50_CENT_MINCE);
    }

    /**
     * Nastavuje fixnu hodnotu 20centovej mince
     * @param pocetKusov pocet 20centovej mince spolu
     */
    public void prijmy20Centovky(int pocetKusov)
    {
        celkovaPrijataHotovost += (pocetKusov * HODNOTA_20_CENT_MINCE);
    }

    /**
     * Nastavuje fixnu hodnotu 10centovej mince
     * @param pocetKusov pocet 10centovej mince spolu
     */
    public void prijmy10Centovky(int pocetKusov)
    {
        celkovaPrijataHotovost += (pocetKusov * HODNOTA_10_CENT_MINCE);
    }

    /**
     * Nastavuje fixnu hodnotu 5centovej mince
     * @param pocetKusov pocet 5 centov mince spolu
     */
    public void prijmy5Centovky(int pocetKusov)
    {
        celkovaPrijataHotovost += (pocetKusov * HODNOTA_5_CENT_MINCE);
    }

    /**
     * Nastavuje fixnu hodnotu 2centovej mince
     * @param pocetKusov pocet 2centovej mince spolu
     */
    public void prijmy2Centovky(int pocetKusov)
    {
        celkovaPrijataHotovost += (pocetKusov * HODNOTA_2_CENT_MINCE);
    }

    /**
     * Nastavuje fixnu hodnotu 1centovej mince
     * @param pocetKusov pocet 1 centovej mince spolu
     */
    public void prijmyCentovky(int pocetKusov)
    {
        celkovaPrijataHotovost += (pocetKusov * HODNOTA_1_CENT_MINCE);
    }
}
