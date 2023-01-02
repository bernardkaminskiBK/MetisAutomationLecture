package academy.metis.javazaklady.lecture7.activity2.Zadanie_7_2_3;

public class BankovyUcet
{
    private double aktualnyZostatok;

    public BankovyUcet(double ciastka)
    {
        this.aktualnyZostatok += ciastka;
    }

    // predstavuje odovzdavanie parametra metody hodnotou
    public double preved(double ciastka, double zostatokNaInomUcte)

    {
        aktualnyZostatok -= ciastka;
        zostatokNaInomUcte += ciastka;
        System.out.println("v metode preved zostatok na inom ucte: " + zostatokNaInomUcte);
        // v implementacnej triede metoda funguje, ale nefunguje v testovacej triede
        return zostatokNaInomUcte;
    }

    // predstavuje odovzdavanie parametra metody hodnotou
    void prevedVoid(double ciastka, double zostatokNaInomUcte)
    // zostatokNaInomUcte je len lokalna premenna a po vykonani metody zanika.
    // Metoda tak v testovacej triede nefunguje obojstranne, iba jednostranne,
    // t.j. ze odpocita z prveho uctu ciastku, ale nepripocita ju na druhy ucet
    {
        aktualnyZostatok -= ciastka;
        zostatokNaInomUcte += ciastka;
        System.out.println("v metode preved zostatok na inom ucte: " + zostatokNaInomUcte);
        // v implementacnej triede metoda funguje, ale nefunguje v testovacej triede

    }

    // predstavuje odovzdavanie parametra metody odkazom
    public void prevodVoid(double ciastka, BankovyUcet inyUcet)
    {
        aktualnyZostatok -= ciastka;
        inyUcet.aktualnyZostatok += ciastka;

    }

    public double prevod(double ciastka, BankovyUcet inyUcet)
    {
        aktualnyZostatok -= ciastka;
        inyUcet.aktualnyZostatok += ciastka;
        return inyUcet.aktualnyZostatok;
    }

    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }
}
