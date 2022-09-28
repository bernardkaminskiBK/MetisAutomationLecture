package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_3.volanie_hodnotou_a_odkazom;

public class BankovyUcetTester
{
    public static void main(String[] args)
    {
        BankovyUcet ucet1 = new BankovyUcet(1000);

        double zostatokNaInomUcte = 2500;

        ucet1.preved(500, zostatokNaInomUcte);

        System.out.println("************************VOLANIE HODNOTOU***********************");

        System.out.println("Aktualny zostatok: " + ucet1.getAktualnyZostatok());
        System.out.println("Zostatok na inom ucte: " + zostatokNaInomUcte);

        System.out.println("************************VOLANIE ODKAZOM***********************");
        BankovyUcet ucet2 = new BankovyUcet(2000);
        BankovyUcet ucet3 = new BankovyUcet(2500);

        System.out.println("Zostatok (ucet2): " + ucet2.getAktualnyZostatok());
        System.out.println("Zostatok (ucet3): " + ucet3.getAktualnyZostatok());

        // prevedieme 500 Eur z ucet2 na ucet3
        ucet2.prevod(500, ucet3);
        System.out.println("\nZostatok (ucet2): " + ucet2.getAktualnyZostatok());
        System.out.println("Zostatok (ucet3): " + ucet3.getAktualnyZostatok());
    }
}
