package javazaklady.Webinar02.c;

public class SporiaciUcetTester
{
    public static void main(String[] args)
    {
        SporiaciUcet ucet = new SporiaciUcet(500, 10);

        ucet.pripisUrok();
        ucet.pripisUrok();
        ucet.pripisUrok();
        ucet.pripisUrok();
        ucet.pripisUrok();

        System.out.printf("Vas aktualny zostatok na ucte je: %.2f EUR.", ucet.getAktualnyZostatok());
        System.out.println("\nOcakavana hodnota zostatku na ucte je 805.25 EUR.");
    }
}


