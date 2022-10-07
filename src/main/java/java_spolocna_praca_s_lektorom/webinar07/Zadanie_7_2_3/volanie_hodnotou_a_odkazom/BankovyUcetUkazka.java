package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_3.volanie_hodnotou_a_odkazom;

public class BankovyUcetUkazka
{
    private double aktualnyZostatok;

    public BankovyUcetUkazka(double ciastka)
    {
        this.aktualnyZostatok += ciastka;
    }

    public double preved(double ciastka, double zostatokNaInomUcte)
    {
        aktualnyZostatok -= ciastka;
        zostatokNaInomUcte += ciastka;
        System.out.println("v metode preved zostatok na inom ucte: " + zostatokNaInomUcte);
        // v implementacnej triede metoda funguje, ale nefunguje v testovacej triede
        return zostatokNaInomUcte;
    }

    void prevedVoid(double ciastka, double zostatokNaInomUcte)
    {
        aktualnyZostatok -= ciastka;
        zostatokNaInomUcte += ciastka;
        System.out.println("v metode preved zostatok na inom ucte: " + zostatokNaInomUcte);
        // v implementacnej triede metoda funguje, ale nefunguje v testovacej triede

    }

    public void prevodVoid(double ciastka, BankovyUcetUkazka inyUcet)
    {
        aktualnyZostatok -= ciastka;
        inyUcet.aktualnyZostatok += ciastka;

    }

    public double prevod(double ciastka, BankovyUcetUkazka inyUcet)
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
