package javazaklady2.Webinar07.part4;

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        BankovyUcet ucet = new BankovyUcet(1000);



       ucet.vloz(2000);



        ucet.vyber(4000);



        System.out.println("zotatok uctu: " + ucet.getAktualnyZostatok() + " Eur");
        System.out.println("Ocakavana hodnota: 2000.0 " + "Eur");
    }
}
