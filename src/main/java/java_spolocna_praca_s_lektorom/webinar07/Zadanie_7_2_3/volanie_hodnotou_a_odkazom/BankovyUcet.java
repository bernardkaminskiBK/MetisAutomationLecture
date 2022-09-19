package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_3.volanie_hodnotou_a_odkazom;

public class BankovyUcet
{
    private double aktualnyZostatok;

    public BankovyUcet(double ciastka)
    {
        this.aktualnyZostatok += ciastka;
    }

    // predstavuje odovzdavanie parametra metody hodnotou
    public void preved(double ciastka, double zostatokNaInomUcte)
    // zostatokNaInomUcte je len lokalna premenna a po vykonani metody zanika
    // metoda tak v v testovacej triede nefunguje obojstranne, iba jednostranne,
    // t.j. ze odpocita z prveho uctu ciastku, ale nepripocita ju na druhy ucet
    {
        aktualnyZostatok -= ciastka;
        zostatokNaInomUcte += ciastka;
        System.out.println("v metode preved zostatok na inom ucte: " + zostatokNaInomUcte);
        // v implementacnej triede metoda funguje, ale nefunguje v testovacej triede
    }

    // predstavuje odovzdavanie parametra metody odkazom
    public void preved(double ciastka, BankovyUcet inyUcet)
    {
        aktualnyZostatok -= ciastka;
        inyUcet.aktualnyZostatok += ciastka;
    }

    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }
}
