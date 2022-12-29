package javazaklady2.Webinar07_Test.part2;


import javazaklady2.Webinar07.part2.Minca;
import javazaklady2.Webinar07.part2.Pokladna;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PokladanaTest {

    private final double HODNOTA_1_EURA = 1.0;
    private final double HODNOTA_50_CENTOV = 0.5;
    private final double HODNOTA_20_CENTOV = 0.2;
    private final double HODNOTA_10_CENTOV = 0.1;
    private final double HODNOTA_5_CENTOV = 0.05;
    private final double HODNOTA_2_CENTOV = 0.02;
    private final double HODNOTA_1_CENTU = 0.01;

    @ParameterizedTest
    @CsvSource(value = {"2.59, 6.99, 9,1,1, 1", "4.55, 6.22, 9,2,5, 2", "9.52, 3.51, 12,2,7, 3"})
    public void prijmiMinceTest(double cenaTovar1, double cenaTovar2, int pocetMinci1, int pocetMinci2, int pocetMinci3, int poradie) {

        Minca eurovaMinca = new Minca("euro", HODNOTA_1_EURA);
        Minca patdesiatcentovaMinca = new Minca("patdesiat centov", HODNOTA_50_CENTOV);
        Minca dvadsatcentovaMinca = new Minca("dvadsat centov", HODNOTA_20_CENTOV);

        Pokladna pokladna = new Pokladna();
        pokladna.nacitajTovar(cenaTovar1);
        pokladna.nacitajTovar(cenaTovar2);

        pokladna.prijmiHotovost(pocetMinci1, eurovaMinca);
        pokladna.prijmiHotovost(pocetMinci2, patdesiatcentovaMinca);
        pokladna.prijmiHotovost(pocetMinci3, dvadsatcentovaMinca);

        int vydavok = 0;

        for (int i = 0; i < getMince().length; i++) {

            int[] ocakavanyVydavok = getOcakavanyVysledok(poradie);

            Minca m = getMince()[i];
            vydavok = pokladna.datVydavok(m);

            Assertions.assertEquals(ocakavanyVydavok[i], vydavok);

        }

    }

    public Minca[] getMince() {
        return new Minca[]
                {
                        new Minca("euro", HODNOTA_1_EURA),
                        new Minca("patdesiat centov", HODNOTA_50_CENTOV),
                        new Minca("dvadsat centov", HODNOTA_20_CENTOV),
                        new Minca("desat centov", HODNOTA_10_CENTOV),
                        new Minca("pat centov", HODNOTA_5_CENTOV),
                        new Minca("dva centy", HODNOTA_2_CENTOV),
                        new Minca("jeden cent", HODNOTA_1_CENTU)
                };
    }


    private int[] getOcakavanyVysledok(int poradie) {
        int[] ocakavanyVydavok = new int[7];

        if (poradie == 1) {
            ocakavanyVydavok = new int[]{0, 0, 0, 1, 0, 1, 0};
        } else if (poradie == 2) {
            ocakavanyVydavok = new int[]{0, 0, 1, 0, 0, 1, 1};
        } else if (poradie == 3) {
            ocakavanyVydavok = new int[]{1, 0, 1, 1, 1, 1, 0};
        }

        return ocakavanyVydavok;
    }

}
