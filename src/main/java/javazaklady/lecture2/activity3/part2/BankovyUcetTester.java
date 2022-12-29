package javazaklady.lecture2.activity3.part2;

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        BankovyUcet ucet = new BankovyUcet(100);

        System.out.println("Vas aktualny zostatok na ucte je: " + spracujTransakcie(ucet,10) + " EUR.");
        System.out.println("Ocakavana hodnota zostatku na ucte je 110 EUR.");
    }

    public static double spracujTransakcie(BankovyUcet ucet, double urokovaSadzba){
        ucet.pripisUrok(urokovaSadzba);

        return ucet.getAktualnyZostatok();
    }
}



/*package Zadanie_2_3_2;

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        banka.BankovyUcet ucet = new banka.BankovyUcet(100);

        ucet.pripisUrok(10);

        System.out.println("Vas aktualny zostatok na ucte je: " + ucet.getAktualnyZostatok() + " EUR.");
        System.out.println("Ocakavana hodnota zostatku na ucte je 110 EUR.");
    }
}
*/


