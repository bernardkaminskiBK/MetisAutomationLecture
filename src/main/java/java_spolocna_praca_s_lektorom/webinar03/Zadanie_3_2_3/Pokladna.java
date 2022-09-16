package java_spolocna_praca_s_lektorom.webinar03.Zadanie_3_2_3;

public class Pokladna {
    private double celkovaPrijataHotovost;
    private double celkovaCenaTovarov;

    public void naskenujTovar(double cenaTovaru)
    {
        celkovaCenaTovarov += cenaTovaru;
    }

    // 5 Eur, 85 centov -> 5.85
    // 2ks - 2Eur, 1ks - 1Eur, 1ks - 50 Cent, 1ks - 20cent, 1ks - 10cent, 1ks - 5 cent,
    // 0ks - 2cent, 0ks - 1cent
    public void prijmiHotovst(int pocet2Eur, int pocetEur, int pocet50Cent, int pocet20Cent,
                              int pocet10Cent, int pocet5Cent, int pocet2Cent, int pocetCent)
    {
        final double HODNOTA_2_EUR_MINCE = 2.0;
        final double HODNOTA_EUR_MINCE = 1.0;
        final double HODNOTA_50_CENT_MINCE = 0.5;
        final double HODNOTA_20_CENT_MINCE = 0.2;
        final double HODNOTA_10_CENT_MINCE = 0.1;
        final double HODNOTA_5_CENT_MINCE = 0.05;
        final double HODNOTA_2_CENT_MINCE = 0.02;
        final double HODNOTA_CENT_MINCE = 0.01;

        celkovaPrijataHotovost += (pocet2Eur * HODNOTA_2_EUR_MINCE);    // CPH = 4.0
        celkovaPrijataHotovost += (pocetEur * HODNOTA_EUR_MINCE);       // CPH = 5.0
        celkovaPrijataHotovost += (pocet50Cent * HODNOTA_50_CENT_MINCE);  // CPH = 5.5
        celkovaPrijataHotovost += (pocet20Cent * HODNOTA_20_CENT_MINCE);  // CPH = 5.7
        celkovaPrijataHotovost += (pocet10Cent * HODNOTA_10_CENT_MINCE);  // CPH = 5.8
        celkovaPrijataHotovost += (pocet5Cent * HODNOTA_5_CENT_MINCE);  // CPH = 5.85
        celkovaPrijataHotovost += (pocet2Cent * HODNOTA_2_CENT_MINCE);  // CPH = 5.85
        celkovaPrijataHotovost += (pocetCent * HODNOTA_CENT_MINCE);  // CPH = 5.85
    }

    public void prijmiHotovost(double hotovost)
    {
        celkovaPrijataHotovost += hotovost;
    }

    public double vratVydavok()
    {
        return celkovaPrijataHotovost - celkovaCenaTovarov;
    }
}
