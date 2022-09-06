package javazaklady.Zadanie_7_3_3;

public class PokladnaTester
{
    public static void main(String[] args)
    {
        final double HODNOTA_1_EURA = 1.0;
        final double HODNOTA_50_CENTOV = 0.5;
        final double HODNOTA_20_CENTOV = 0.2;
        final double HODNOTA_10_CENTOV = 0.1;
        final double HODNOTA_5_CENTOV = 0.05;
        final double HODNOTA_2_CENTOV = 0.02;
        final double HODNOTA_1_CENTU = 0.01;

        final double HODNOTA_5_EUR = 5.0;
        final double HODNOTA_10_EUR = 10.0;
        final double HODNOTA_20_EUR = 20.0;
        final double HODNOTA_50_EUR = 50.0;
        final double HODNOTA_100_EUR = 100.0;
        final double HODNOTA_200_EUR = 200.0;
        final double HODNOTA_500_EUR = 500.0;

        // vytvorime si jednotlive mince
        Minca eurovaMinca = new Minca("Eurovka", HODNOTA_1_EURA);
        Minca patdesiatcentovaMinca = new Minca("Patdesiatcentovka", HODNOTA_50_CENTOV);
        Minca dvadsatcentovaMinca = new Minca("Dvadsatcentovka", HODNOTA_20_CENTOV);

        Bankovka stovka = new Bankovka("Stovka", HODNOTA_100_EUR);
        Bankovka dvadsiatka = new Bankovka("Dvadsiatka", HODNOTA_20_EUR);

        Pokladna pokladna = new Pokladna();
        pokladna.naskenujTovar(2.59);
        pokladna.naskenujTovar(6.99);
        pokladna.prijmiMince(9, eurovaMinca);
        pokladna.prijmiMince(1, patdesiatcentovaMinca);
        pokladna.prijmiMince(1, dvadsatcentovaMinca);
        pokladna.prijmiBankovky(3, stovka);
        pokladna.prijmiBankovky(5, dvadsiatka);
        double vydavok = pokladna.datVydavok();
        System.out.printf("Vydavok: %.2f EUR", vydavok);
        System.out.println("\nOcakavana hodnota: 12 centov");
    }
}
