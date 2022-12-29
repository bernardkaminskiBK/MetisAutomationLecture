package javazaklady.lecture7.activity3.part2;

public class PokladnaTester {
    public static void main(String[] args) {
        final double HODNOTA_1_EURA = 1.0;
        final double HODNOTA_50_CENTOV = 0.5;
        final double HODNOTA_20_CENTOV = 0.2;
        final double HODNOTA_10_CENTOV = 0.1;
        final double HODNOTA_5_CENTOV = 0.05;
        final double HODNOTA_2_CENTOV = 0.02;
        final double HODNOTA_1_CENTU = 0.01;

        Minca eurovaMinca = new Minca("euro", HODNOTA_1_EURA);
        Minca patdesiatcentovaMinca = new Minca("patdesiat centov", HODNOTA_50_CENTOV);
        Minca dvadsatcentovaMinca = new Minca("dvadsat centov", HODNOTA_20_CENTOV);

        Pokladna pokladna = new Pokladna();
        pokladna.nacitajTovar(2.59);
        pokladna.nacitajTovar(6.99);

        pokladna.prijmiHotovost(9, eurovaMinca);
        pokladna.prijmiHotovost(1, patdesiatcentovaMinca);
        pokladna.prijmiHotovost(1, dvadsatcentovaMinca);

        Minca[] typyMinci = new Minca[]
                {
                        new Minca("euro", HODNOTA_1_EURA),
                        new Minca("patdesiat centov", HODNOTA_50_CENTOV),
                        new Minca("dvadsat centov", HODNOTA_20_CENTOV),
                        new Minca("desat centov", HODNOTA_10_CENTOV),
                        new Minca("pat centov", HODNOTA_5_CENTOV),
                        new Minca("dva centy", HODNOTA_2_CENTOV),
                        new Minca("jeden cent", HODNOTA_1_CENTU)
                };

        int[] ocakavanyVydavok = {0, 0, 0, 1, 0, 1, 0};

        for (int i = 0; i < typyMinci.length; i++) {
            Minca m = typyMinci[i];

            int vydavok = pokladna.datVydavok(m);

            System.out.println(m.getNazovMince() + ": " + vydavok);
            System.out.println("Ocakavana hodnota: " + ocakavanyVydavok[i]);
        }
    }
}
