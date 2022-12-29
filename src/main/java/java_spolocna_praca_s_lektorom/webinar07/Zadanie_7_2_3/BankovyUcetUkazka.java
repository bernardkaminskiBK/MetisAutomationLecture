package java_spolocna_praca_s_lektorom.webinar07.Zadanie_7_2_3;

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
        return zostatokNaInomUcte;
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
