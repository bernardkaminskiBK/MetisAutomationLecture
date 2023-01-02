package academy.metis.javazaklady.lecture3.activity3.part2;

    /**
     * Pokladna dokaze vypocitat vydavok na zakladne prijatej hotovosti a naskenovanych tovarov. Uchovava si aj celkovy pocet naskenovanych (predanych) tovarov.
     */
    public class Pokladna
    {
        private double prijataHotovost;
        private double celkovaCenaTovarov;
        private int pocetTovarov;

        private final static double HODNOTA_EUR_MINCE = 1.0;
        private final static double HODNOTA_50_CENT_MINCE = 0.5;
        private final static double HODNOTA_20_CENT_MINCE = 0.2;
        private final static double HODNOTA_10_CENT_MINCE = 0.10;
        private final static double HODNOTA_5_CENT_MINCE = 0.05;
        private final static double HODNOTA_2_CENT_MINCE = 0.02;
        private final static double HODNOTA_1_CENT_MINCE = 0.01;

        /**
         * Vytvara novu pokladnu bez penazi
         */
        public Pokladna()
        {
            prijataHotovost = 0;
            celkovaCenaTovarov = 0;
        }

        /**
         * Pripise zadanu sumu k celkovej cene tovaru, ako aj navysuje pocet naskenovanych tovarov
         * @param cena cena tovaru
         */
        public void naskenujTovar(double cena)
        {
            celkovaCenaTovarov += cena;
            pocetTovarov++;
        }

        /**
         * Dava udaj o pocte naskenovanych tovarov
         * @return
         */
        public int getPocetTovarov()
        {
            return pocetTovarov;
        }

        /**
         * Vypocita vydavok ako rozdiel prijatej hotovosti a celkovej ceny tovaru
         * @return
         */
        public double vratVydavok()
        {
            return prijataHotovost - celkovaCenaTovarov;
        }

        /**
         * Po vrateni vydavku resetuje pocet tovarov opat na 0
         */
        public void resetPocetTovarov()
        {
            pocetTovarov = 0;
        }

        /**
         * Pripise k prijatej hotovosti sumu v jednoeurovkach
         * @param pocetKusov pocet kusov jednoeuroviek
         */
        public void prijmyEura(int pocetKusov)
        {
            prijataHotovost += pocetKusov * HODNOTA_EUR_MINCE;
        }

        /**
         * Pripise k prijatej hotovosti sumu v 50 centovkach
         * @param pocetKusov pocet kusov 50 centoviek
         */
        public void prijmy50Centovky(int pocetKusov)
        {
            prijataHotovost += pocetKusov * HODNOTA_50_CENT_MINCE;
        }

        /**
         * Pripise k prijatej hotovosti sumu v 20 centovkach
         * @param pocetKusov pocet kusov 20 centoviek
         */
        public void prijmy20Centovky(int pocetKusov)
        {
            final double HOD_20_CEN_MIN = 0.20;
            prijataHotovost += pocetKusov * HODNOTA_20_CENT_MINCE;
        }

        /**
         * Pripise k prijatej hotovosti sumu v 10 centovkach
         * @param pocetKusov pocet kusov 10 centoviek
         */
        public void prijmy10Centovky(int pocetKusov)
        {
            prijataHotovost += pocetKusov * HODNOTA_10_CENT_MINCE;
        }

        /**
         * Pripise k prijatej hotovosti sumu v 5 centovkach
         * @param pocetKusov pocet kusov 5 centoviek
         */
        public void prijmy5Centovky(int pocetKusov)
        {
            prijataHotovost += pocetKusov * HODNOTA_5_CENT_MINCE;
        }

        /**
         * Pripise k prijatej hotovosti sumu v 2 centovkach
         * @param pocetKusov pocet kusov 2 centoviek
         */
        public void prijmy2Centovky(int pocetKusov)
        {
            prijataHotovost += pocetKusov * HODNOTA_2_CENT_MINCE;
        }

        /**
         * Pripise k prijatej hotovosti sumu v 1 centovkach
         * @param pocetKusov pocet kusov 1 centoviek
         */
        public void prijmyCentovky(int pocetKusov)
        {
            prijataHotovost += pocetKusov * HODNOTA_1_CENT_MINCE;
        }
    }

