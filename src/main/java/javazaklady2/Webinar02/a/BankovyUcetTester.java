package javazaklady2.Webinar02.a;

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        BankovyUcet ucet = new BankovyUcet();

        System.out.println("Vas aktualny zostatok na ucte je: " + spracujTransakcie(ucet,2000,1000) + " EUR.");
        System.out.println("Ocakavana hodnota zostatku na ucte je 1000 EUR.");
    }



    public static double spracujTransakcie(BankovyUcet ucet,double vlozCiastka, double vyberCiastka){
        ucet.vloz(vlozCiastka);
        ucet.vyber(vyberCiastka);
        return ucet.getAktualnyZostatok();
    }
}
/*

package Zadanie_2_3_1;

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        BankovyUcet ucet = new BankovyUcet();

        ucet.vloz(2000);

        ucet.vyber(1000);

        System.out.println("Vas aktualny zostatok na ucte je: " + ucet.getAktualnyZostatok() + " EUR.");
        System.out.println("Ocakavana hodnota zostatku na ucte je 1000 EUR.");
    }
}

*/
